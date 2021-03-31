int getNthFromLast(Node *head, int n)
{
    // using two pointers approach
    Node *start, *end, *next;
    start = end = head;
    int count = 0;
    
    // start points to head
    // while end points to the node
    // n distance away from the head
    while(count < n && end != NULL){
        next = end->next;
        end = next;
        count++;
    }
    
    // when n > length of the LL
    if(count < n && end == NULL) {
        return -1;
    }
    
    // after n distance traversal
    // if end has reached the end of LL
    // then start points to the nth node from
    // the end of the LL
    if(end == NULL) {
        return start->data;
    }
    
    // move both pointers one by one
    // if end hasn't reached the end of the LL
    // after n distance traversal
    while(end != NULL) {
        next = start->next;
        start = next;
        next = end->next;
        end = next;
    }
    
    return start->data;
}