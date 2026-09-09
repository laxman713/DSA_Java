
/* Problem 3: Row Sum of a Matrix

Problem Statement:

Given a 2D integer matrix with n rows and m columns, calculate and print the sum of each row separately.

Example 1

Input:

1 2 3
4 5 6
7 8 9

Output:

6
15
24

Explanation:

Row 1 → 1 + 2 + 3 = 6
Row 2 → 4 + 5 + 6 = 15
Row 3 → 7 + 8 + 9 = 24 */

public class RowSum {

    public static void rowSum(int[][] matrix) {
        int sum =0;
        for(int i=0;i<matrix.length;i++){
             sum = 0;
            for(int j=0;j<matrix[i].length;j++){
               sum = sum+matrix[i][j];
            }
            System.out.println(sum);
        }
        


    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rowSum(matrix);
    }
}