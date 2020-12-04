// https://leetcode.com/problems/reformat-date/

class Solution {
    public String reformatDate(String date) {
        
        String[] monthArray = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        List<String> list = Arrays.asList(monthArray);
        
        String[] split = date.split(" ");
        String day = split[0].replaceAll("\\D", "");
        // \D means "not digit" in regex
        int month = list.indexOf(split[1]);
        
        // "%02d" means if length of the argument is less than 2 then pad with a zero
        return split[2] + "-" + String.format("%02d", month) + "-" + String.format("%02d", Integer.parseInt(day));
    }
}