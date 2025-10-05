import java.util.*;

public class LC172 {

    public int trailingZeroes(int n) {
        int count = 0;

        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }

    public static void main(String[] args) {
        LC172 solution = new LC172();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number n to calculate trailing zeroes of n!:");
        int n = sc.nextInt();

        int result = solution.trailingZeroes(n);
        System.out.println("Number of trailing zeroes in " + n + "! is: " + result);

        sc.close();
    }
}
