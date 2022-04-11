// https://www.geeksforgeeks.org/find-missing-value-from-the-given-equation-a-b-c/

class Solution {
    public static void main(String args[]) {
        String equation = "3+2=x";
        System.out.println(solveEquation(equation));
    }

    static int solveEquation(String equation) {
        boolean minusFlag = false;
        int num1, num2;
        num1 = num2 = 0;
        
        String[] sp = equation.split("\\+");

        if(sp[1].startsWith("x")) {
            minusFlag = true;
            num1 = Integer.parseInt(sp[0]);
            num2 = Integer.parseInt(sp[1].split("=")[1]);
        }else{
            if(sp[0].equals("x")) {
                minusFlag = true;
                String[] sl = sp[1].split("=");
                num1 = Integer.parseInt(sl[0]);
                num2 = Integer.parseInt(sl[1]);
            }else{
                num1 = Integer.parseInt(sp[0]);
                num2 = Integer.parseInt(sp[1].split("=")[0]);
            }
        }

        if(minusFlag) {
            return Math.abs(num1 - num2);
        }else{
            System.out.println(num1 + " " + num2);
            return num1 + num2;
        }
    }
}