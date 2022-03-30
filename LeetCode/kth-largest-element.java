import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        for(int i=0; i<k-1; i++) {
            maxHeap.poll();
        }

        return maxHeap.peek();
    }
}