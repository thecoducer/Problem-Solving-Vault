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
        
        // if value doesn't match
        if(t1.val != t2.val) {
            return false;
        }
        
        // we recurse two times to check whether the tree is mirror of itself or not
        // that means whether it is symmetric around its center or not
        // dfs is applied here
        return helper(t1.left, t2.right) && helper(t1.right, t2.left);
    }
}

// iterative solution
class Solution1 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root.left);
        q.add(root.right);

        while (!q.isEmpty()) {
            TreeNode l = q.remove();
            TreeNode r = q.remove();

            if (l == null && r == null) {
                continue;
            }

            if (l == null || r == null) {
                return false;
            }

            if (l.val != r.val) {
                return false;
            }

            q.add(l.left);
            q.add(r.right);
            q.add(l.right);
            q.add(r.left);
        }

        return true;
    }
}
