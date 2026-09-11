/*  You are given an array of integers nums and an integer k.

Return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

 

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Example 2:

Input: nums = [1,2,3], k = 0
Output: 0 */


import java.util.*;

public class SubarrayProductLessThanK {

    public static int product(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int right = 0;
        int product = 1;
        int count = 0;

        while (right < nums.length) {

            product = product * nums[right];

            while (product >= k) {
                product = product / nums[left];
                left++;
            }

            count = count + (right - left + 1);

            right++;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 6};
        int k = 100;

        int result = product(nums, k);

        System.out.println(result);
    }
}