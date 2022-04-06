// https://leetcode.com/problems/add-two-numbers/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;
        
        while(l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            sum = sum % 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
        }
        
        return dummyHead.next;
    }
}