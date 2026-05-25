class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();

        int i = len - 1;
        while (i >= 0) {
            // skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int end = i;

            // move left until space or start of string
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            String word = s.substring(i + 1, end + 1);

            if(sb.length() > 0) {
                sb.append(" ");
            }

            sb.append(word);
        }

        return sb.toString();
    }
}