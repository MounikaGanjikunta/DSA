/* You are given a positive number represented on a piece of paper. The number may contains digits (0 to 9).
Write a function that takes this number and when the number is rotated by 180 degrees, the following conditions are met:
1. The rotated number remains readable and can be correctly interpreted as a valid integer.
2. The value of the rotated number remains the same as the original number.
*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class isPalindrome {
    public static boolean isPalindrome(String y) {
        //String y = String.valueOf(x);
        System.out.println(y);
        String validDigits = "01869";
        for (int i = 0; i < y.length(); i++) {
            char digit = y.charAt(i);
            if (validDigits.indexOf(digit) == -1) {
                return false;
            }
        }
        int i = 0;
        int j = y.length() - 1;
        while(i < j){
            
                if(y.length()%2 != 0 && (y.charAt(y.length()/2) == '6' || y.charAt(y.length()/2) == '9')){
                    return false;
                }
                if(y.charAt(i) == y.charAt(j) || (y.charAt(i) == '6' & y.charAt(j) == '9') ||(y.charAt(i) == '9' & y.charAt(j) == '6')){
                    i++;
                    j--;
                }else{
                    return false;
                }
            
        }
        return true;
        }
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
       String x = "14841";
       System.out.println(isPalindrome(x));
    }
    
}
