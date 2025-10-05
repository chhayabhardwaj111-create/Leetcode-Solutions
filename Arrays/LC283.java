import java.util.*;

public class LC283 {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        LC283 solution = new LC283();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        solution.moveZeroes(nums);

        System.out.println("Array after moving zeroes:");
        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}
