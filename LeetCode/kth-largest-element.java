import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    /**
    * Stored the elements in a max heap
    * if we do extractMax() k-1 times
    * then we will be left with kth largest element
    * TC: O(k + logN)
    * SC: O(N)
    */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        for(int i=0; i<k-1; i++) {
            maxHeap.poll();
        }

        return maxHeap.peek();
    }
}

