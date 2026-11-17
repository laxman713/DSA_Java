/* Problem 3: Palindrome Number Easy

Problem: Given an integer n, check whether it reads the same forward and backward.

Examples:
Input: 121
Output: true

Input: 123
Output: false

Input: 1221
Output: true

Input: -121
Output: false */



  class Palindrome{

    public static void main(String[] args) {
          int number = 121;
          int original = number;
          int reverse = 0;

          while(number>0){
      int digit = number%10;//3 2
         reverse = reverse*10+digit;//30
         number = number/10;//12

          }
         System.out.println(reverse);

          if(original == reverse){
            System.out.println("Palindrome");
          }else{
            System.out.println("not palindrome");
          }

    }
}