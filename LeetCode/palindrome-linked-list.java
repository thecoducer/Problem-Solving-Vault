// class Solution {
//     public:
//         bool isPalindrome(ListNode* head) {
//             ListNode *secondHead, *slow, *fast, *next, *prev, *current;
//             slow = fast = head;
            
//             // Find the middle of the LL
//             // The middle node will be the head of the second half list
//             while(fast != NULL && fast->next != NULL){
//                 slow = slow->next;
//                 fast = fast->next->next;
//             }
            
//             secondHead = slow;
            
//             // Reverse the second half
//             current = secondHead;
//             prev = NULL;
//             while(current != NULL) {
//                 next = current->next;
//                 current->next = prev;
//                 prev = current;
//                 current = next;
//             }
            
//             // Check both the halves for palindrome
//             current = head;
//             while(prev != NULL) {
//                 if(prev->val != current->val) {
//                     return false;
//                 }
//                 prev = prev->next;
//                 current = current->next;
//             }
            
//             return true;
//         }
//     };
    
//     // Time: O(n) and Space: O(1)


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