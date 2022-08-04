class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        ArrayList<Integer> bfs = new ArrayList<>();
        
        // mentioned in the question to start from 0
        queue.add(0);
        visited[0] = true;
        
        while(queue.size() != 0) {
            int element = queue.poll();
            bfs.add(element);
            
            ArrayList<Integer> adjacentVertices = adj.get(element);
            
            for(int vertex : adjacentVertices) {
                if(!visited[vertex]) {
                    queue.add(vertex);
                    visited[vertex] = true;
                }
            }
        }
        
        return bfs;
    }
}