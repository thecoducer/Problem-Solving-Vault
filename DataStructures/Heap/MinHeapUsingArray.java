public class MinHeapUsingArray {

    int[] data;
    int capacity;
    int heapSize;

    MinHeapUsingArray(int capacity) {
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

    

    // decreaseKey

    // extractMin

    // getMini

    // heapify

    // deleteKey

    // insertKey
}