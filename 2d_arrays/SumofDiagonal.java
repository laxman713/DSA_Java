/* Problem Description: Sum of Diagonal Elements
You are given an N × N square matrix. Your task is to calculate the sum of both its primary diagonal and secondary diagonal elements.

The primary diagonal consists of elements where row index = column index (i.e., matrix[i][i]).
The secondary diagonal consists of elements where row index + column index = N - 1 (i.e., matrix[i][N-1-i]).


Input Format:
The first line contains an integer N, the size of the square matrix.
The next N lines each contain N space-separated integers representing the matrix elements.
Output Format:
Print the sum of the primary and secondary diagonal elements.
If a number appears in both diagonals (in case of an odd-sized matrix), count it only once.


Examples:
Example 1:
Input:

3

1 2 3

4 5 6

7 8 9

Primary Diagonal: 1 + 5 + 9 = 15

 Secondary Diagonal: 3 + 5 + 7 = 15

 (Since 5 appears in both, count it only once)

 Output:

25



Example 2:
Input:

2

1 2

3 4

Primary Diagonal: 1 + 4 = 5

 Secondary Diagonal: 2 + 3 = 5

Output:

10 */
import java.util.*;


public class SumofDiagonal {
    public static int sumOfDiagonals(int N, int[][] matrix) {
    //   Write your code here
     int sum =0;
     for(int i=0;i<matrix.length;i++){
            sum = sum+matrix[i][i]+matrix[i][N-1-i];
     }
     if(N%2==1){
        sum = sum-matrix[N/2][N/2];
     }
     return sum;

    }

    //Don't change anything below this line ,if changed please revert 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = scanner.nextInt();

        System.out.println(sumOfDiagonals(N, matrix));
        scanner.close();
    }
}