class LRUCache {

    /*
     * Core operations:
     * 1. get(key) - If not in cache, return -1. 
     * And if present then move the node to the front and return the node's value.
     * 2. put(key, value) - if key already exists, update the value and move node to front.
     * Otherwise insert the new value.
     * Check cache size before insertion. If exceeds the capacity, then evict least recently used value.
     * Then create the new node, add it to front and insert it to the cache.
     * 
     * We use the map for cache and the doubly linked list for ordering.
     */

    class Node {
        int key, value;
        Node prev, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, Node> cache;
    private final int capacity;
    private Node head, tail;

    public LRUCache(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;

        // initializing the doubly linked list
        // head and tail are dummy nodes
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key);
        moveToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveToFront(node);
        } else {
            if (cache.size() >= capacity) {
                cache.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node(key, value);
            addToHead(newNode);
            cache.put(key, newNode);
        }
    }

    private void moveToFront(Node node) {
        remove(node);
        addToHead(node);
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node) {
        node.next = head.next; // head.next gives us the first node
        head.next.prev = node;

        node.prev = head;
        head.next = node;
    }
}