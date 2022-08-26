class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            
            List<Integer> level = new ArrayList<>();
            
            for(int i=0;i<levelSize;i++) {
                TreeNode currNode = queue.poll();
                level.add(currNode.val);
                
                if(currNode.left != null) {
                    queue.add(currNode.left);
                }
                
                if(currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
            
            res.add(level);
        }
        
        return res;
    }
}