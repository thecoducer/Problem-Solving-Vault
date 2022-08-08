// https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

/**
 * Say, you have a connected graph with V nodes and E edges.
 * 
 * In DFS, you traverse each node exactly once. Therefore, the time complexity
 * of DFS is at least O(V).
 * 
 * Now, any additional complexity comes from how you discover all the outgoing
 * paths or edges for each node which, in turn, is dependent on the way your
 * graph is implemented. If an edge leads you to a node that has already been
 * traversed, you skip it and check the next. Typical DFS implementations use a
 * hash table to maintain the list of traversed nodes so that you could find out
 * if a node has been encountered before in O(1) time (constant time).
 * 
 * If your graph is implemented as an adjacency matrix (a V x V array), then,
 * for each node, you have to traverse an entire row of length V in the matrix
 * to discover all its outgoing edges. Please note that each row in an adjacency
 * matrix corresponds to a node in the graph, and the said row stores
 * information about edges stemming from the node. So, the complexity of DFS is
 * O(V * V) = O(V^2).
 * 
 * If your graph is implemented using adjacency lists, wherein each node
 * maintains a list of all its adjacent edges, then, for each node, you could
 * discover all its neighbors by traversing its adjacency list just once in
 * linear time. 
 * 
 * For a directed graph, the sum of the sizes of the adjacency
 * lists of all the nodes is E (total number of edges). So, the complexity of
 * DFS is O(V) + O(E) = O(V + E).
 * 
 * For an undirected graph, each edge will appear twice. Once in the adjacency
 * list of either end of the edge. So, the overall complexity will be O(V) + O
 * (2E) ~ O(V + E).
 * 
 * There are different other ways to implement a graph. You can reason the
 * complexity accordingly.
 */

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

        for (int vertex : adjacentVertices) {
            if (!visited[vertex]) {
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

        while (!stack.isEmpty()) {
            int element = stack.pop();

            // stack may contain same vertex twice
            // so we need to print the popped item only
            // if it is not visited
            if (!visited[element]) {
                dfs.add(element);
                visited[element] = true;
            }

            ArrayList<Integer> adjacentVertices = adj.get(element);

            for (int vertex : adjacentVertices) {
                if (!visited[vertex]) {
                    stack.push(vertex);
                }
            }
        }

        return dfs;
    }
}