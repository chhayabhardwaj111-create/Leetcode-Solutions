import java.util.*;

public class LC349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> obj1 = new HashSet<>();
        HashSet<Integer> obj2 = new HashSet<>();

        for (int num : nums1) {
            obj1.add(num);
        }

        for (int num : nums2) {
            if (obj1.contains(num)) {
                obj2.add(num);
            }
        }

        int[] result = new int[obj2.size()];
        int i = 0;
        for (int num : obj2) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        LC349 solution = new LC349();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = solution.intersection(nums1, nums2);
        System.out.println("Intersection array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
