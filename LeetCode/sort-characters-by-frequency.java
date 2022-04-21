import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    /**
     * 
     * TC: O(N log N)
     * SC: O(N)
     */
    public String frequencySort(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> a.getValue() < b.getValue() ? 1 : -1);
        
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            maxHeap.add(entry);
        }

        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len && maxHeap.size() > 0;i++) {
            char c = maxHeap.poll().getKey();
            int count = countMap.get(c);

            for(int j=0;j<count;j++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}