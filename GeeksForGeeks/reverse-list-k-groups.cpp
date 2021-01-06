struct node *reverse (struct node *head, int k)
{ 
    struct node *current = head, *prev = NULL, *next = NULL;
    
    // reverse groups of exactly k nodes
    int i = 0;
    while(current != NULL && i < k) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
        i++;
    }
    
    if(current != NULL) {
        // head is the tail of the k reversed list.
        // attach the tail to the head of the next
        // k reversed list. 
        // reverse() returns prev 
        head->next = reverse(current, k);
    }
    
    // prev is the head of the k reversed list
    return prev;
}