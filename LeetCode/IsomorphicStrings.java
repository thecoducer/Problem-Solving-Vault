class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                // s = "ejo"
                // t = "geg"
                // Expected: false
                // 'g' in t is already mapped to 'e' and can't be mapped to 'o' again
                // therefore we check if we have an already mapped character. 
                if(map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}