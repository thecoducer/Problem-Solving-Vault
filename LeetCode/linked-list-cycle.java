public class Solution {
    // using slow and fast pointers
    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}