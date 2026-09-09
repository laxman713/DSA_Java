// Find the Kth Missing Positive Number


// Share
// Array
// Binary Search
// Sorting
//  Problem Description

// Given a sorted array of unique positive integers and an integer K, find the Kth missing positive number.

// 🔹 Constraints:

// The array is sorted in ascending order.
// The missing numbers increase naturally from 1.
// Efficient approach using Binary Search is required.


// Examples

// Example 1

// Input:

// arr = [2, 3, 4, 7, 11], K = 5

// Output:

// 9



// Explanation:

// Missing numbers: [1, 5, 6, 8, 9, 10, 12, ...]

// The 5th missing number is 9.



// Example 2

// Input:

// arr = [1, 2, 3, 4], K = 2

// Output:

// 6



// Explanation:

// Missing numbers: [5, 6, 7, ...]

// The 2nd missing number is 6.





import java.util.*;
public class Kth_missing_positive{
    public static int findKthMissing(int[] arr, int K) {
        // Implement here

        int left=0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            int missing = arr[mid]-(mid+1);
            if(missing <K){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return right+1+K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(findKthMissing(arr, K));
        sc.close();
    }
}
