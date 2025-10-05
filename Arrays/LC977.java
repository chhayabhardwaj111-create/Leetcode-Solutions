import java.util.*;

public class LC977 {

    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int count = nums.length - 1;

        while (start <= end) {
            if (nums[start] * nums[start] >= nums[end] * nums[end]) {
                arr[count] = nums[start] * nums[start];
                start++;
            } else {
                arr[count] = nums[end] * nums[end];
                end--;
            }
            count--;
        }

        return arr;
    }

    public static void main(String[] args) {
        LC977 solution = new LC977();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the sorted array elements (can be negative):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = solution.sortedSquares(nums);

        System.out.println("Sorted squares array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
