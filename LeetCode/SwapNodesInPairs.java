class Solution {
    public ListNode swapPairs(ListNode head) {
        // A two-pointer approach to swap nodes in pairs
        // DummyHead is introduced to help us get the head of the modified LL
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev, curr;
        curr = head;
        prev = dummyHead;

        // LL: dummyHead -> 1 -> 2 -> 3 -> 4 -> NULL
        // Value of the variables are in comments for the first iteration
        while (curr != null && curr.next != null) {
            ListNode temp = curr.next; // curr = 1, temp = 2
            curr.next = temp.next; // 1 -> 3
            temp.next = curr; // 2 -> 1
            prev.next = temp; // dummyHead -> 2
            prev = curr; // prev = 1
            curr = curr.next; // curr = 3
        }

        return dummyHead.next;
    }
}