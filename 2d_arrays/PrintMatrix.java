/* Problem: Print a Matrix

Problem Statement:

Given a 2D integer matrix with n rows and m columns, print all the elements of the matrix row by row, from left to right.

Example 1

Input:

n = 3
m = 3

matrix =
1 2 3
4 5 6
7 8 9

Output:

1 2 3
4 5 6
7 8 9
Example 2

Input:

n = 2
m = 4

matrix =
10 20 30 40
50 60 70 80

Output:

10 20 30 40
50 60 70 80
Constraints
1 <= n, m <= 100
Matrix elements are integers.

Expected Time Complexity: O(n × m)
Expected Space Complexity: O(1) excluding the input matrix. */

public class PrintMatrix{

    public static void printMatrix(int[][] matrix) {
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
       }

    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printMatrix(matrix);
    }
}