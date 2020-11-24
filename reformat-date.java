import java.util.regex.*;
class Solution {
    public String reformatDate(String dateStr) {
        
        String[] splitArray = dateStr.split(" ");
        
        HashMap<String, String> months = new HashMap<>();
        
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        
        int i = 0;
        String date = "";
        while(splitArray[0].charAt(i) >= '0' && splitArray[0].charAt(i) <= '9') {
            date = date + splitArray[0].charAt(i);
            i++;
        }
        
        date = date.length() < 2 ? "0" + date : date;
        
        String result = splitArray[2] + "-" + months.get(splitArray[1]) + "-" + date;
        
        return result;
    }
}
