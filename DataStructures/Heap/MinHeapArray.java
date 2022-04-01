public class MinHeapArray {

    int[] data;
    int capacity;
    int heapSize;

    MinHeapArray(int capacity) {
        this.heapSize = 0;
        this.capacity = capacity;
        this.data = new int[capacity];
    }

    int parentIndex(int index) {
        return (index - 1) / 2;
    }

    int leftIndex(int index) {
        return (2 * index) + 1;
    }

    int rightIndex(int index) {
        return (2 * index) + 2;
    }

    int getMini() {
        // minimum element is at the root in a MinHeap
        return data[0];
    }

    void insertKey(int value) {
        if (heapSize == capacity) {
            System.out.println("Heap Overflow!");
        }

        // insert the new value at the end
        heapSize++;
        int index = heapSize - 1;
        data[index] = value;

        // fix the min heap property if it's violated
        while (index != 0 && data[parentIndex(index)] > data[index]) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    void deleteKey(int index) {
        decreaseKey(index, Integer.MIN_VALUE);
        extractMin();
    }

    int extractMin() {
        if (heapSize <= 0) {
            return Integer.MIN_VALUE;
        }

        if (heapSize == 1) {
            heapSize--;
            return data[0];
        }

        int root = data[0];
        data[0] = data[heapSize - 1];
        heapSize--;
        minHeapify(0);

        return root;
    }

    void decreaseKey(int index, int newValue) {
        data[index] = newValue;

        while (index != 0 && data[parentIndex(index)] > data[index]) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    // A recursive method to heapify a subtree with the root at given index
    // This method assumes that the subtrees are already heapified
    void minHeapify(int index) {
        int left = leftIndex(index);
        int right = rightIndex(index);
        int min = index; // root at this index, so we can assume that it's the minimum

        if (left < heapSize && data[left] < data[index]) {
            min = left;
        }

        if (right < heapSize && data[right] < data[min]) {
            min = right;
        }

        if (min != index) {
            swap(index, min);
            minHeapify(min);
        }
    }

    void swap(int indexOne, int indexTwo) {
        int temp = data[indexOne];
        data[indexOne] = data[indexTwo];
        data[indexTwo] = temp;
    }

    public static void main(String args[]) {
        MinHeapArray minHeap = new MinHeapArray(10);
        // 7, 10, 4, 3, 20, 15

        minHeap.insertKey(7);
        minHeap.insertKey(10);
        minHeap.insertKey(4);
        minHeap.insertKey(3);
        minHeap.insertKey(20);
        minHeap.insertKey(15);

        int k = 3;

        for (int i = 0; i < k - 1; i++) {
            minHeap.extractMin();
        }

        System.out.println(minHeap.getMini());
    }

}