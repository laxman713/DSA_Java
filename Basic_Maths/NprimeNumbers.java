/* Problem 7B: Print the First 50 Prime Numbers Easy–Medium

Problem Statement
Write a Java program to print the first 50 prime numbers in ascending order.

A prime number is a number greater than 1 that has exactly two positive factors: 1 and itself.
Example 1
Input:
n = 5
Output:
2 3 5 7 11


Example 2
Input:
n = 10


Output:
2 3 5 7 11 13 17 19 23 29


Your actual task
Input:
n = 50


Expected output: The first 50 prime numbers, starting from 2 and ending at 229. */

class NprimeNumbers {
    public static void main(String[] args) {
        int n = 5000;
        int number = 2;
        int count = 0;

        while (count < n) {
            int i = 2;
            boolean isPrime = true;

            while (i*i < number) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}