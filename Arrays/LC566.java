import java.util.*;

public class LC566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) {
            return mat;
        }

        int[][] reshaped = new int[r][c];

        for (int k = 0; k < rows * cols; k++) {
            reshaped[k / c][k % c] = mat[k / cols][k % cols];
        }

        return reshaped;
    }

    public static void main(String[] args) {

        LC566 solution = new LC566();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows of the original matrix:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns of the original matrix:");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the desired number of rows (r):");
        int r = sc.nextInt();
        System.out.println("Enter the desired number of columns (c):");
        int c = sc.nextInt();

        int[][] result = solution.matrixReshape(mat, r, c);

        System.out.println("Reshaped Matrix:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

        sc.close();
    }
}
