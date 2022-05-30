class MinStack {
    
    // modifying the Node structure to accomodate the min value in every node
    // this way we can get the min value in O(1)
    // all other operation take O(1) time too
    
    private Node head;
    
    public void push(int val) {
        if(head == null) {
            head = new Node(val, val, null);
        }else{
            // current head becomes the next node
            // and the new node here becomes the new head
            head = new Node(val, Math.min(val, head.minValue), head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.minValue;
    }
    
    private class Node {
        int data;
        int minValue;
        Node next;
        
        Node(int data, int minValue, Node next) {
            this.data = data;
            this.minValue = minValue;
            this.next = next;
        }
    }

}

