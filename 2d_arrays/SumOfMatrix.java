// Problem 2: Sum of All Matrix Elements

// Problem Statement:

// Given a 2D integer matrix, calculate and return the sum of all elements in the matrix.

// Example

// Input:

// 1 2 3
// 4 5 6
// 7 8 9

// Output:

// 45

// Because:

// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45

public class SumOfMatrix {
    public static int sumMatrix(int[][] matrix) {
       int sum =0;
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            sum = sum + matrix[i][j];
        }
       }
       return sum;
       

    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(sumMatrix(matrix));
    }
}