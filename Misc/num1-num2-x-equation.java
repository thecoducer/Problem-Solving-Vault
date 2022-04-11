class Solution {
    public static void main(String args[]) {
        String equation = "x+3=2";
        System.out.println(solveEquation(equation));
    }

    static int solveEquation(String equation) {
        boolean minusFlag = false;
        int num1, num2;
        num1 = num2 = 0;
        
        String[] sp = equation.split("\\+");

        if(sp[0].equals("x")) {
            minusFlag = true;
            num1 = Integer.parseInt(sp[1].split("=")[0]);
        }else{
            num1 = Integer.parseInt(sp[0]);
        }

        String[] se = sp[1].split("=");

        if(se[0].equals("x")) {
            minusFlag = true;
            num2 = Integer.parseInt(se[1]);
        }else{
            num2 = Integer.parseInt(se[0]);
        }

        if(minusFlag) {
            return Math.abs(num1 - num2);
        }else{
            return num1 + num2;
        }
    }
}