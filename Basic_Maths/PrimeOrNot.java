/* 
Problem 7: Prime Number Easy

Problem Statement
Given a positive integer n, determine whether it is a prime number.

A prime number is a number greater than 1 that has exactly two positive factors: 1 and itself.
Example 1
Input:
n = 7


Output:
Prime Number


Explanation: 7 has only two factors: 1 and 7.
Example 2
Input:
n = 12


Output:
Not a Prime Number


Explanation: 12 has factors 1, 2, 3, 4, 6, and 12.
Example 3
Input:
n = 2


Output:
Prime Number
 */

class PrimeOrNot{
    public static void main(String[] args) {
        int n = 7;
        int i =2;
        int factors = 2;
        while(i<n){
          if(n%i==0){//9%2
           factors++;
           i++;
          }
          else{
            i++;
          }
        }
        if(n <= 1 || factors > 2){
            System.err.println("Not a prime number");
        }else{
            System.err.println("Prime Number");
        }
    }
}