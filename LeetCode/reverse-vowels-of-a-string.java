class Solution {
    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        Set<Character> set = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] ca = s.toCharArray();
        
        while(start < end) {
            if(!set.contains(ca[start])) {
                start++;
            }else if(!set.contains(ca[end])) {
                end--;
            }else{
                swap(ca, start, end);
                start++;
                end--;
            }
        }
        return new String(ca);
    }
    
    void swap(char[] ca, int start, int end) {
        char c = ca[start];
        ca[start] = ca[end];
        ca[end] = c;
    }
}