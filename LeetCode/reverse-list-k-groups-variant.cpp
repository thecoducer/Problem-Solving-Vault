class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode *current = head, *prev = NULL, *next = NULL, *tempcurr, *tempprev;
        
        // reverse k nodes
        int count = 0;
        while(current != NULL && count < k) {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
            count++;
        }
        
        // when k > the count of the remaining nodes 
        // then don't reverse the remaining nodes
        // but the above loop has already reversed it
        // so we will reverse that part again to
        // retain its original order
        if(k > count) {
            tempcurr = prev;
            tempprev = NULL;
            
            while(tempcurr != NULL) {
                next = tempcurr->next;
                tempcurr->next = tempprev;
                tempprev = tempcurr;
                tempcurr = next;
            }
            
            // tempprev is the head here
            return tempprev;
        }
        
        if(current != NULL) {
            head->next = reverseKGroup(current, k);
        }
        
        return prev;
    }
};

// Time complexity: O(N)
// Space complexity: O(1)