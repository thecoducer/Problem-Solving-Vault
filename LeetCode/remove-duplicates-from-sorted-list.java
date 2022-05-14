class Solution {
    // TC: O(N)
    // SC: O(1)
    // using two pointers
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr, prev;
        curr = prev = head;
        
        while(curr != null){            
            if(prev.val != curr.val){
                // updating prev with the new unique element found
                prev = curr; 
            }else{
                // skipping the duplicate elements in between
                // and making the prev point to the next of element of duplicate element
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        
        return head;
    }
}