import java.util.*;

public class LC540 {

    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 != 0) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }

        return nums[end];
    }

    public static void main(String[] args) {
        LC540 solution = new LC540();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array (must have exactly one single element):");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the sorted array elements (all duplicates except one):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solution.singleNonDuplicate(nums);
        System.out.println("Single non-duplicate element: " + result);

        sc.close();
    }
}
