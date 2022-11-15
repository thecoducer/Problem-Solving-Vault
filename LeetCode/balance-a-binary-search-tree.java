class Solution {
    
    // the idea is to store the inorder traversal of the given tree in a list
    // inorder gives us an increasing sorted sequence
    // now find the middle and make it the root
    // and do the same for the left and right halves of the middle element

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        return buildBalancedBst(inorder, 0, inorder.size() - 1);
    }
    
    TreeNode buildBalancedBst(List<Integer> inorder, int start, int end) {
        if(start > end) {
            return null;
        }
        
        int mid = start + (end - start) / 2;
        
        TreeNode node = new TreeNode(inorder.get(mid));
        
        node.left = buildBalancedBst(inorder, start, mid - 1);
        
        node.right = buildBalancedBst(inorder, mid + 1, end);
        
        return node;
        
    }
    
    void inorderTraversal(TreeNode root, List<Integer> inorder) {
        if(root == null) {
            return;
        }
        
        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }
}