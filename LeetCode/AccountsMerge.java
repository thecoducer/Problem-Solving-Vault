class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int numAccounts = accounts.size();
        DisjointSetUnion dsu = new DisjointSetUnion(numAccounts);

        // building email to account mapping
        // along with DSU construction
        Map<String, Integer> emailToAccount = new HashMap<>();

        for (int accountIndex = 0; accountIndex < numAccounts; accountIndex++) {
            List<String> currentAccount = accounts.get(accountIndex);

            for (int emailIndex = 1; emailIndex < currentAccount.size(); emailIndex++) {
                String email = currentAccount.get(emailIndex);

                if (emailToAccount.containsKey(email)) {
                    dsu.union(accountIndex, emailToAccount.get(email));
                } else {
                    emailToAccount.put(email, accountIndex);
                }
            }
        }

        // group emails by root account
        Map<Integer, Set<String>> rootToEmails = new HashMap<>();
        for (int accountIndex = 0; accountIndex < numAccounts; accountIndex++) {
            int rootAccount = dsu.find(accountIndex);
            List<String> currentAccount = accounts.get(accountIndex);

            rootToEmails.computeIfAbsent(rootAccount, k -> new HashSet<>())
                    .addAll(currentAccount.subList(1, currentAccount.size()));
        }

        // constructing the final merged list
        List<List<String>> mergedAccounts = new ArrayList<>();
        for (Map.Entry<Integer, Set<String>> entry : rootToEmails.entrySet()) {
            int rootAccount = entry.getKey();
            Set<String> emails = entry.getValue();

            List<String> sortedEmails = new ArrayList<>(emails);
            Collections.sort(sortedEmails);

            List<String> mergedAccount = new ArrayList<>();
            String accountName = accounts.get(rootAccount).get(0);
            mergedAccount.add(accountName);
            mergedAccount.addAll(sortedEmails);

            mergedAccounts.add(mergedAccount);
        }

        return mergedAccounts;
    }
}

class DisjointSetUnion {
    public int size[];
    public int parent[];

    public DisjointSetUnion(int n) {
        size = new int[n];
        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        parent[x] = find(parent[x]);

        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) {
            return;
        }

        if (size[rootX] < size[rootY]) {
            parent[rootX] = rootY;
            size[rootY] += size[rootX];
        } else {
            parent[rootY] = rootX;
            size[rootX] += rootY;
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}