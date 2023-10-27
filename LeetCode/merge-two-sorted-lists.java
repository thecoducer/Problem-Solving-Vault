class Solution {
    /**
     * TC: O(N+M)
     * SC: O(1)
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // used pointer rearrangement technique
        
        // if any of the list is empty, return the other list
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        
        ListNode head = null, tail = null;
        
        // setting the head
        // head of which ever list has smaller value is the head of the result list
        if(l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        }else{
            head = l2;
            l2 = l2.next;
        }
        
        tail = head;
        
        // iterating till any of the list gets exhausted
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
                tail = tail.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            }
        }
        
        // if any of the list gets exhausted, attach the other list to the tail
        if(l1 == null) {
            tail.next = l2;
        }
        if(l2 == null) {
            tail.next = l1;
        }
        
        return head;
    }
}