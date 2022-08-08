class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }
    
    boolean helper(TreeNode t1, TreeNode t2) {        
        if(t1 == null && t2 == null) {
            return true;
        }
        
        if(t1 == null || t2 == null) {
            return false;
        }
        
        // if value doesn't matches
        if(t1.val != t2.val) {
            return false;
        }
        
        // we recurse two times to check whether the tree is mirror of itself or not
        // that means whether it is symmetric around its center or not
        return helper(t1.left, t2.right) && helper(t1.right, t2.left);
    }
}