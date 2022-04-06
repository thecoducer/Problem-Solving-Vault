// https://leetcode.com/problems/add-two-numbers-ii/

import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();

        // insert elements from LL to stack
        while(l1 != null) {
            first.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null) {
            second.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;
        while(!first.isEmpty() || !second.isEmpty() || carry != 0) {
            int sum = carry;

            if(!first.isEmpty()) {
                sum += first.pop();
            }

            if(!second.isEmpty()) {
                sum += second.pop();
            }

            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);
            newNode.next = head;
            head = newNode;
        }

        return head;
    }
}