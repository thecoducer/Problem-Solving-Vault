class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev, curr;
        curr = head;
        prev = dummyHead;
        
        // for the first run
        // curr = 1
        // curr.next = 2
        // temp.next = 3
        while(curr != null && curr.next != null) {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = curr;
            prev.next = temp;
            prev = curr;
            curr = curr.next;
        }

        return dummyHead.next;
    }
}