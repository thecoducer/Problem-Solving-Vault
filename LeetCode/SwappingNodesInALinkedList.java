class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow, fast;
        slow = fast = head;

        // move the fast pointer k steps ahead in the LL
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        // store the kth position node
        ListNode first = fast;

        // move both the pointers one step at a time
        // the slow pointer is at kth position from the end when the fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // swap the values
        int temp = slow.val;
        slow.val = first.val;
        first.val = temp;

        return head;
    }
}