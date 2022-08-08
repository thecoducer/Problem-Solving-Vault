// https://www.geeksforgeeks.org/connected-components-in-an-undirected-graph/

import java.util.*;

class Graph {

    // TC: O(V + E) using DFS
    

    int V;
    ArrayList<ArrayList<Integer>> adjList;

    // constructor
    Graph(int V) {
        this.V = V;
        // define the size of array as
        // number of vertices
        adjList = new ArrayList<>();

        // Create a new list for each vertex
        // such that adjacent nodes can be stored

        for (int i = 0; i < V; i++) {
            adjList.add(i, new ArrayList<>());
        }
    }

    // Adds an edge to an undirected graph
    void addEdge(int src, int dest) {
        // Add an edge from src to dest.
        adjList.get(src).add(dest);

        // Since graph is undirected, add an edge from dest
        // to src also
        adjList.get(dest).add(src);
    }

    public void allConnectedComponents() {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited);
                System.out.println();
            }
        }
    }

    // recursive DFS
    private void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        ArrayList<Integer> adjacentVertices = adjList.get(v);

        for (int vertex : adjacentVertices) {
            if (!visited[vertex]) {
                dfs(vertex, visited);
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph given in the above diagram
        Graph g = new Graph(5); // 5 vertices numbered from 0 to 4

        g.addEdge(1, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Following are connected components");
        g.allConnectedComponents();
    }
}
