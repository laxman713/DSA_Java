
/* 

Problem Statement
Given two positive integers a and b, find their Greatest Common Divisor (GCD).

The GCD is the largest positive integer that divides both numbers without leaving a remainder.
Example 1
Input:
a = 12
b = 18


Output:
6

 */

class GCD{
    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 36;
        int i =1;
         int gcd = 0;

     while (i <= Math.max(number1, number2)) {
       if(number1%i==0&&number2%i==0){
        gcd = i;
       }
       i++;
        }
        System.out.println(gcd);
        

     }

    }
