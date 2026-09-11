/* 904. Fruit Into Baskets
Solved
Medium
Topics
premium lock icon
Companies
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

 

Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.
Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
Example 3:

Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2]. */


import java.util.HashMap;

public class FruitIntoBasket {

    public static int totalFruit(int[] fruits) {

        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < fruits.length) {

            if (map.containsKey(fruits[right])) {
                map.put(fruits[right], map.get(fruits[right]) + 1);
            } else {
                map.put(fruits[right], 1);
            }

            while (map.size() > 2) {

                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            int length = right - left + 1;

            max = Math.max(length, max);

            right++;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] fruits = {1, 2, 3, 2, 2};

        int result = totalFruit(fruits);

        System.out.println(result);
    }
}