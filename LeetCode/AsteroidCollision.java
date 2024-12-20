class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for(int a : asteroids) {
            // stack.peek() > 0 and a < 0 means they are moving in opposite direction
            // if they are moving in same direction they are never going to collide
            while(!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                if(stack.peek() < Math.abs(a)) {
                    stack.pop();
                    continue;
                }else if(stack.peek() == Math.abs(a)) {
                    stack.pop();
                }
                a = 0;
            }
            if(a != 0) {
                stack.push(a);
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}