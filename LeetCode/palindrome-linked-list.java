class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode secondListHead, curr, prev, next, slow, fast;
        slow = fast = curr = head;
        prev = null;

        // find the middle of the LL
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        secondListHead = slow;

        // reverse the second half of the list
        curr = secondListHead;
        prev = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // check the two halves of the list
        curr = head;
        while(prev != null) {
            if(curr.val != prev.val) {
                return false;
            }
            curr = curr.next;
            prev = prev.next;
        }

        return true;
    }
}