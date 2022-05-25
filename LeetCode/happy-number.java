class Solution1 {
    // we start from getNext(2)
    // and after a while we notice that there is a cycle
    // it comes back to 4
    // 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
    // we can store this cycle members in a hashset
    // or we can just use 4
    // TC: O(log n)
    // SC: O(1)
    public boolean isHappy(int n) {
        while(n != 1 && n != 4) {
            n = getNext(n);
        }
        return n == 1;
    }
    
    int getNext(int n) {
        int sum = 0, t;
        while(n != 0) {
            t = n % 10;
            sum += (t * t);
            n = n / 10;
        }
        return sum;
    }
}

class Solution {
    // we either get to 1 or into a cycle
    // we can use Floyd's cycle detection algo
    // the next node is given by getNext(n)
    // TC: O(log n)
    // SC: O(1)
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        
        while(fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        
        return fast == 1;
    }
    
    int getNext(int n) {
        int sum = 0, t;
        while(n != 0) {
            t = n % 10;
            sum += (t * t);
            n = n / 10;
        }
        return sum;
    }
}