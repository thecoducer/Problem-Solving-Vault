class Solution {
    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
        return diameter;
    }

    // the max sum of the longest left height and
    // the longest right height of the binary tree will
    // give us the diameter of the binary tree
    private int calculateDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateDiameter(root.left);
        int rightHeight = calculateDiameter(root.right);
        diameter = Math.max(leftHeight + rightHeight, diameter);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}