import java.util.*;

public class LC153 {

    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {
        LC153 solution = new LC153();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the rotated sorted array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solution.findMin(nums);
        System.out.println("Minimum element in the array: " + result);

        sc.close();
    }
}
