import java.util.*;

class Node {
    int data;
    Node both; // XOR of prev and next addresses

    public Node(int data) {
        this.data = data;
        this.both = null;
    }
}

public class XORDoublyLinkedList {
    private Node head;
    private Node tail;

    public XORDoublyLinkedList() {
        this.head = this.tail = null;
    }

    public void insertAtTheHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.both = _xor(null, tail);
            tail.both = _xor(newNode, _xor(null, tail.both));
            tail = newNode;
        }
    }

    public void printElements() {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            System.out.print(current.data + "->");
            next = _xor(prev, current.both);
            prev = current;
            current = next;
        }
        System.out.print("NULL\n");
    }

    Node _xor(Node a, Node b) {
        return new Node(getHashCode(a) ^ getHashCode(b));
    }

    private int getHashCode(Node node) {
        return System.identityHashCode(node);
    }

    public static void main(String args[]) {
        XORDoublyLinkedList list = new XORDoublyLinkedList();
        list.insertAtTheHead(10);
        list.insertAtTheHead(20);
        list.insertAtTheHead(30);
        list.printElements();
    }
}
