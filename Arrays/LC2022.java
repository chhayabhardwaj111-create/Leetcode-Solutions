import java.util.*;

public class LC2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {

        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] arr = new int[m][n];

        for (int i = 0; i < original.length; i++) {
            arr[i / n][i % n] = original[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        LC2022 solution = new LC2022();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the original array:");
        int len = sc.nextInt();
        int[] original = new int[len];

        System.out.println("Enter the elements of the original array:");
        for (int i = 0; i < len; i++) {
            original[i] = sc.nextInt();
        }

        System.out.println("Enter number of rows (m):");
        int m = sc.nextInt();
        System.out.println("Enter number of columns (n):");
        int n = sc.nextInt();

        int[][] result = solution.construct2DArray(original, m, n);

        System.out.println("Resulting 2D Array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

        sc.close();
    }
}
