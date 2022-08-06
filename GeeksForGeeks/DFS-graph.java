// https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

class Solution {
    // recursive DFS
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> dfsList = new ArrayList<>();
        dfs(0, adj, visited, dfsList);
        return dfsList;
    }

    private void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfsList) {
        visited[v] = true;
        dfsList.add(v);

        ArrayList<Integer> adjacentVertices = adj.get(v);

        for(int vertex : adjacentVertices) {
            if(!visited[vertex]) {
                dfs(vertex, adj, visited, dfsList);
            }
        }
    }
}

class Solution1 {
    // iterative DFS
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> dfs = new ArrayList<>();

        stack.push(0);

        while(!stack.isEmpty()) {
            int element = stack.pop();

            // stack may contain same vertex twice
            // so we need to print the popped item only
            // if it is not visited
            if(!visited[element]) {
                dfs.add(element);
                visited[element] = true;
            }

            ArrayList<Integer> adjacentVertices = adj.get(element);

            for(int vertex : adjacentVertices) {
                if(!visited[vertex]) {
                    stack.push(vertex);
                }
            }
        }

        return dfs;
    }
}