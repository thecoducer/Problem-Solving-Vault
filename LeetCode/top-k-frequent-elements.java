// https://leetcode.com/problems/top-k-frequent-elements/

import java.util.*;

class Solution1 {
    /**
     * Displays in order
     * if same frequency for two elements then take the greater element
     * TC: O(k logN + N)
     * SC: O(N)
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int v : nums) {
            countMap.put(v, countMap.getOrDefault(v, 0) + 1);
        }

        // key represents the numbers
        // value represents their frequency

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> a.getValue().equals(b.getValue()) ? Integer.compare(b.getKey(), a.getKey())
                        : Integer.compare(b.getValue(), a.getValue()));

        // the comparator logic written here will compare numbers if frequency for any
        // two elements are same

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            maxHeap.add(entry);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(maxHeap.poll().getKey());
        }

        return list.stream().mapToInt(i -> i).toArray();

    }
}

class Solution {
    /**
     * Displays in any order
     * TC: O(N)
     * SC: O(N)
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int v : nums) {
            countMap.put(v, countMap.getOrDefault(v, 0) + 1);
        }

        // using frequency indexing
        List<List<Integer>> freqList = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            freqList.add(new ArrayList<Integer>());
        }

        countMap.forEach((num, freq) -> {
            freqList.get(freq).add(num);
        });

        List<Integer> result = new ArrayList<>();
        int count = 0;
        // traverse the freq list from right
        for (int i = nums.length; i >= 0; i--) {
            for (int v : freqList.get(i)) {
                result.add(v);
                count++;
                if (count == k) {
                   return result.stream().mapToInt(e -> e).toArray();
                }
            }
        }
        return result.stream().mapToInt(e -> e).toArray();
    }
}