import java.util.*;

public class LC48 {

    public void rotate(int[][] matrix) {

        transpose(matrix);

        int left = 0;
        int right = matrix.length - 1;

        while (left < right) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
            left++;
            right--;
        }
    }

    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        LC48 solution = new LC48();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix:");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        solution.rotate(matrix);

        System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        sc.close();
    }
}
