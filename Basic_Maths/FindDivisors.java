
/* Problem Statement
Given a positive integer n, print all its positive divisors in ascending order.

A divisor is a number that divides n without leaving a remainder.
Example 1
Input:
n = 12


Output:
1 2 3 4 6 12


Example 2
Input:
n = 15


Output:
1 3 5 15 */

class FindDivisors{
    public static void main(String[] args) {
        int N = 15;
        
        int i =1;
        while(i<=N){
            if(N%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}