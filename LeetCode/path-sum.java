class Solution {
    // the idea here is to traverse each node down a root-to-leaf path 
    // and subtract each node's value from the targetSum
    // so when we reach a leaf node we then check whether that node's value is equal to the current value of targetSum or not
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // when it reaches beyond the leaf node
        if(root == null) {
            return false;
        }
        
        // when it's the leaf node
        if(root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        
        // dfs
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}