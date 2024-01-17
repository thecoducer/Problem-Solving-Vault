// https://practice.geeksforgeeks.org/problems/level-order-traversal/1

class Solution
{
    static ArrayList<Integer> levelOrder(Node node) 
    {
        // BFS or Level Order Traversal of a Tree
        Queue<Node> queue = new ArrayDeque<>();
        ArrayList<Integer> bfs = new ArrayList<>();
        
        queue.add(node);
        
        while(!queue.isEmpty()) {
            Node element = queue.poll();
            bfs.add(element.data);
            
            if(element.left != null) {
                queue.add(element.left);
            }
            
            if(element.right != null) {
                queue.add(element.right);
            }
        } 
        
        return bfs;
    }
}