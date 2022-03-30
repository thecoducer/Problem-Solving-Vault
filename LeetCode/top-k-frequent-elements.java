import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int v : nums) {
            countMap.put(v, countMap.getOrDefault(v, 0) + 1);
        }

        // key represents the numbers
        // value represents their frequency

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> a.getValue().equals(b.getValue()) ? Integer.compare(b.getKey(),a.getKey()) : Integer.compare(b.getValue(), a.getValue())
            );

        // the comparator logic written here will compare numbers if frequency for any two elements is same

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            maxHeap.add(entry);
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<k; i++) {
            list.add(maxHeap.poll().getKey());
        }

        return list.stream().mapToInt(i -> i).toArray();

    }
}