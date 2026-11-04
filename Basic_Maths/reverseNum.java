/* 
Reverse a Number

Given an integer, reverse its digits and return the reversed number.

Examples:
Input:  12345
Output: 54321

Input:  908
Output: 809

Input:  1200
Output: 21
*/

 class Main {

    public static void main(String[] args) {

        int num = 12345;
        int reverse = 0;
        // Your logic here

        while(num>0){
       int digit = num%10;
       reverse = reverse*10+digit;
       num = num/10;
        }
    System.err.println(reverse);

    }
}