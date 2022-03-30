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

    void insertKey(int value) {
        if(heapSize == capacity) {
            System.out.println("Heap Overflow!");
        }

        // insert the new value at the end
        heapSize++;
        int index = heapSize - 1;
        data[index] = value;

        // fix the min heap property if it's violated
        while(index != 0 && data[parentIndex(index)] > data[index]) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    void decreaseKey(int index, int newValue) {
        data[index] = newValue;

        while(index != 0 && data[parentIndex(index)] > data[index]) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    int getMini() {
        // minimum element is at the root in a MinHeap
        return data[0];
    }

    int extractMin() {
        if(heapSize <= 0) {
            return Integer.MIN_VALUE;
        }

        if(heapSize == 1) {
            heapSize--;
            return data[0];
        }

        int root = data[0];
        data[0] = data[heapSize - 1];
        heapSize--;
        minHeapify(0);

        return root;
    }

    void deleteKey(int index) {
        decreaseKey(index, Integer.MIN_VALUE);
        extractMin();
    }

    void minHeapify(int index) {
        int left = leftIndex(index);
        int right = rightIndex(index);
        int min = index;

        if(left < heapSize && data[left] < data[index]) {
            min = left;
        }

        if(right < heapSize && data[right] < data[min]) {
            min = right;
        }

        if(min != index) {
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
        minHeap.insertKey(3);
        minHeap.insertKey(2);
        minHeap.deleteKey(1);
        minHeap.insertKey(15);
        minHeap.insertKey(5);
        minHeap.insertKey(4);
        minHeap.insertKey(45);
        System.out.println(minHeap.extractMin());
        System.out.println(minHeap.getMini());
        minHeap.decreaseKey(2, 1);
        System.out.println(minHeap.getMini());
    }
    
}