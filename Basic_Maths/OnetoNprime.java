/*
Problem 7C: Print All Prime Numbers from 1 to N
Easy
Problem Statement
Given a positive integer n, write a Java program to print all prime numbers between 1 and n (inclusive) in ascending order.

A prime number is greater than 1 and has exactly two factors: 1 and itself.
Example 1
Input:
n = 10


Output:
2 3 5 7


Example 2
Input:
n = 20


Output:
2 3 5 7 11 13 17 19
 */

public class OnetoNprime {

    public static void main(String[] args) {
        int N = 10;
        int number = 2;

        while (N >= number) {
            int i = 2;
            boolean isPrime = true;
            while (i < number) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.println(number);
            }
            number++;
        }
    }
}
