listnode* solve(listnode* head, int k) {
    int i;
    listnode *current = head, *prev = NULL, *next = NULL;
    
    // base case
    if(current == NULL) {
        return NULL;
    }
    
    // reverse k nodes
    for(i=0;i<k;i++) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    
    // link the k reversed list to the remaining part of the original list
    // head is the last node of the k reversed linked list
    head->next = current;
    
    if(current == NULL) {
        return prev;
    }
    
    // skip k nodes
    for(i=0;i<k-1;i++) {
        current = current->next;
    }
    
    // link the unreversed part with the reversed part
    // solve() will return prev when we have elements remaining
    // and, solve() will return NULL when we have reached the end of the list
    current->next = solve(current->next, k);
    
    return prev;
}