int intersectPoint(Node* head1, Node* head2)
{
    // Hashing can be used to solve this easily
    // but it would require O(N) space
    //
    // Better solution is to make the first list circular
    // and that makes a loop with the other list
    // Now it is simple. We just need to find the start of the loop
    
    Node *current = head1, *lastNode;
    int length = 0;
    
    // traverse the first list
    while(current != NULL) {
        // to capture the last node
        if(current->next == NULL) {
            lastNode = current;    
        }
        
        length++;
        current = current -> next;
    }
    
    // make last node point to head; circular
    lastNode->next = head1;
    
    current = head2;
    int t = length;
    
    // traverse the second list upto the size of the first list
    while(current != NULL && t > 0) {
        current = current->next;
        t--;
    }
    
    Node *secondLL = head2;
    
    // traverse both the lists in parallel and check for equality of nodes
    while(current != NULL || secondLL != NULL) {
        if(current->next == secondLL->next) {
            return current->next->data;
        }
        
        current = current->next;
        secondLL = secondLL->next;
    }

    // remove the circular link
    lastNode->next = NULL;
    
    return -1;
}