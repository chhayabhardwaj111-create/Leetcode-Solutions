import java.util.*;

public class LC350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];

        for (int num : nums1) {
            freq[num]++;
        }

        ArrayList<Integer> obj = new ArrayList<>();

        for (int num : nums2) {
            if (freq[num] > 0) {
                obj.add(num);
                freq[num]--;
            }
        }

        int[] result = new int[obj.size()];
        for (int i = 0; i < obj.size(); i++) {
            result[i] = obj.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        LC350 solution = new LC350();
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

        int[] result = solution.intersect(nums1, nums2);
        System.out.println("Intersection array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
