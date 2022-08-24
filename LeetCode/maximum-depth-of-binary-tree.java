class Solution {
    // TC: O(N)
    // SC: O(max depth of the tree)
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }

        // the way how we keep the count here is similar to the
        // way we count total digits in an integer

        return Math.max(dfs(root.left, max), dfs(root.right, max)) + 1;
    }
}
