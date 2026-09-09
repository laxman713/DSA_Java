
// Problem Statement:

// Given a 2D integer matrix with n rows and m columns, calculate and print the sum of each column separately.

// Example

// Input:

// 1 2 3
// 4 5 6
// 7 8 9

// Output:

// 12
// 15
// 18

// Explanation:

// Column 1 → 1 + 4 + 7 = 12
// Column 2 → 2 + 5 + 8 = 15
// Column 3 → 3 + 6 + 9 = 18

public class ColSum {



    public static void columnSum(int[][] matrix) {
        int sum =0;
        for(int i=0;i<matrix.length;i++){
             sum = 0;
            for(int j=0;j<matrix[i].length;j++){
               sum = sum+matrix[j][i];
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

        columnSum(matrix);
    }
}