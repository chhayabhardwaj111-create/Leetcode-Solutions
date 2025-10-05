import java.util.*;

public class LC240 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return true;
            } else if (target < current) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        LC240 solution = new LC240();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter number of columns:");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        boolean result = solution.searchMatrix(matrix, target);
        System.out.println("Target found? " + result);

        sc.close();
    }
}
