// recursive
class Solution1 {
    public boolean isSameTree(TreeNode a, TreeNode b) {
        // equal
        if(a == null && b == null) {
            return true;
        }
        
        //inequal
        if(a == null || b == null) {
            return false;
        }       
    
        // inequal
        if(a.val != b.val) {
            return false;
        }
        
        // recurse
        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }
}

//iterative
//this iterative solution is very similar to the isSymmetric tree iterative solution
class Solution {
    public boolean isSameTree(TreeNode a, TreeNode b) {
        Stack<TreeNode> s = new Stack<>();
        
        s.add(a);
        s.add(b);
        
        while(!s.isEmpty()) {
            TreeNode tempB = s.pop();
            TreeNode tempA = s.pop();
            
            if(tempA == null && tempB == null) {
                continue;
            }
            
            if(tempA == null || tempB == null) {
                return false;
            }
            
            if(tempA.val != tempB.val) {
                return false;
            }
            
            s.add(tempA.left);
            s.add(tempB.left);
            s.add(tempA.right);
            s.add(tempB.right);
        }
        
        return true;       
        
    }
}

