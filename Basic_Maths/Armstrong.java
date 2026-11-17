/* 
Problem 4: Armstrong Number Easy

Problem Statement
Given an integer n, determine whether it is an Armstrong number.

An Armstrong number is a number that is equal to the sum of its digits, where each digit is raised to the power of the total number of digits.
Example 1
Input:
n = 153


Explanation:

153 contains 3 digits.
\[
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
\]

Output:
Armstrong Number


*/



 class ArmStrong{
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int answer = 0;
        while(number>0){
         int digit = number%10;
         int power =(int) Math.pow(digit,3);
        answer = answer+power;
        number = number/10;
        }
        System.out.println(answer);
        if(original==answer){
            System.err.println("Armstrong Number");
        }else{
            System.err.println("Not Armstrong");
        }
    }
}