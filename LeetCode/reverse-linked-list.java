// recursive
class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // last node gets stored in newHead
        ListNode newHead = reverseList(head.next);
        
        // List = [1, 2, 3, 4, 5]
        // When head.next is null for the first time
        // head is 5
        // it returns to function call stack reverseList(4)
        // so head is 4 now
        
        // 4 -> 5 -> next = head;
        // reversed
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}


// iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}