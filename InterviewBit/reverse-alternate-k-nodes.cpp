listnode* solve(listnode* head, int k) {
    int i;
    listnode *current = head, *prev = NULL, *next = NULL;
    
    // reverse k nodes
    int count = 0;
    while(current != NULL && count < k) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
        count++;
    }
    
    // link the k reversed list to the remaining part of the original list
    // head is the last node of the k reversed linked list
    if(head != NULL) {
        head->next = current;
    }
    
    // skip k nodes
    count = 0;
    while(current != NULL && count < k-1) {
        current = current->next;
        count++;
    }
    
    // we call solve() for the rest of the list
    // also, link the unreversed part with the reversed part
    // solve() will return prev when we have elements remaining
    // and, solve() will return NULL when we have reached the end of the list
    if(current != NULL) {
        current->next = solve(current->next, k);
    }
    
    return prev;
}