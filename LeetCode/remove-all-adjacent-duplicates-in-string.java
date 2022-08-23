// using stack
class Solution1 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        stack.push(s.charAt(0));
        
        for(int i=1;i<s.length();i++) {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }
        
        return res.toString();
    }
}

// using StringBuilder
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder("");
        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int len = sb.length();
            if (len > 0 && s.charAt(i) == sb.charAt(len-1)) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
