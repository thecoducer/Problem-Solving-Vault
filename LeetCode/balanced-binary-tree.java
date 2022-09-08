// https://youtu.be/Yt50Jfbd8Po?t=683
// Do watch this if you forget the logic behind returning -1

// TC : O(N)

class Solution {
    // the idea here is to modify the implementation of finding the
    // height of the tree and identify whether the tree is a balanced tree or not
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
    
    public int dfsHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int leftHeight = dfsHeight(root.left);
        int rightHeight = dfsHeight(root.right);
        
        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }else{
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}