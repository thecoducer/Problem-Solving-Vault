// https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

class Solution {
    
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        Map<Integer, Boolean> visited = new HashMap<>();
        
        queue.offer(0);
        visited.put(0, true);
        
        while(!queue.isEmpty()) {
            int element = queue.poll();
            bfs.add(element);
            
            ArrayList<Integer> adjacentVertices = adj.get(element);
            
            for(int vertex : adjacentVertices) {
                if(!visited.containsKey(vertex)) {
                    queue.offer(vertex);
                    visited.put(vertex, true);
                }
            }
        }
        
    }
}