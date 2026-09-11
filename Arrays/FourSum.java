/* 18. 4Sum
Medium
Topics
premium lock icon
Companies
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109 */


import java.util.*;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int p = j + 1;
                int q = nums.length - 1;

                while (p < q) {

                    int sum = nums[i] + nums[j] + nums[p] + nums[q];

                    if (sum < target) {
                        p++;
                    }
                    else if (sum > target) {
                        q--;
                    }
                    else {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[p]);
                        temp.add(nums[q]);

                        result.add(temp);

                        p++;
                        q--;

                        while (p < q && nums[p] == nums[p - 1]) {
                            p++;
                        }

                        while (p < q && nums[q] == nums[q + 1]) {
                            q--;
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println(result);
    }
}