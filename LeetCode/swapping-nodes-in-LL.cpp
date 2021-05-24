class Solution {
public:
    ListNode* swapNodes(ListNode* head, int k) {
        // two pointers approach
        // we are swapping the data here
        ListNode *slow = head, *fast = head, *a;
        
        for(int i=0;i<k;i++) {
            a = fast;
            fast = fast -> next;
        }
        
        // a is pointing to kth node from the start
        
        while(fast != NULL) {
            fast = fast -> next;
            slow = slow -> next;
        }
        
        // slow is now pointing to kth node from the end
        
        int b = slow -> val;
        slow -> val = a -> val;
        a -> val = b;
        
        return head;
    }
};