 // using DFS
 class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null || root.right == null) {
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}


/**
 * BFS is much better here, rather than a DFS approach.
 * 
 * Sure, the solution here is short in terms of lines of code and looks nice,
 * but it's far from optimal.
 * 
 * If you have a tree where say the root's left subtree has a depth of 500 and
 * the right subtree has a depth of 1, the code is going to traverse all the way
 * down the 500 left subtree first before finally traversing the right subtree
 * with a measly depth of 1 and figuring out "d'oh!" that's the min depth.
 * 
 * With BFS, instead of traversing 501 nodes to figure out the min depth, you
 * could've just traversed two. Now imagine if the left subtree comprised of
 * tens of thousands of nodes ...
 */


// using BFS
class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();

                if (currNode.left == null && currNode.right == null) {
                    return depth;
                }

                if (currNode.left != null) {
                    queue.add(currNode.left);
                }

                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }

            depth++;
        }

        return depth;
    }
}


