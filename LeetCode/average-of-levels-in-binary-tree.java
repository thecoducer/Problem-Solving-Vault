class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            double avg = 0.0;
            int levelSize = queue.size();

            // traverse the entire level at once and 
            // find the average
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                avg += currNode.val;

                if (currNode.left != null) {
                    queue.add(currNode.left);
                }

                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }

            res.add(avg / levelSize);
        }

        return res;
    }
}
