public class DisjointSetUnion {
    private int[] parent;
    private int[] size;
    
    public DisjointSetUnion(int n) {
        parent = new int[n];
        size = new int[n];

        // each element is its own parent initially
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if(parent[x] == x) {
            return x;
        }

        // path compression optimization
        parent[x] = find(parent[x]);

        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if(rootX == rootY) {
            return;
        }

        // union by size optimization
        // attach the smaller tree under the larger tree
        if(size[rootX] < size[rootY]) {
            parent[rootX] = rootY;
            size[rootY] += size[rootX];
        } else {
            parent[rootY] = rootX;  
            size[rootX] += size[rootY];
        }
    }

    public boolean connected(int x, int y) {
        // two nodes are connected if they have the same root
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        DisjointSetUnion dsu = new DisjointSetUnion(10);

        dsu.union(1, 2);
        dsu.union(2, 3);
        dsu.union(4, 5);

        System.out.println(dsu.connected(1, 3)); // true
        System.out.println(dsu.connected(1, 2)); // true
        System.out.println(dsu.connected(1, 4)); // false

        dsu.union(3, 4);
        System.out.println(dsu.connected(1, 4)); // true
        System.out.println(dsu.connected(1, 5)); // true
    }
}
