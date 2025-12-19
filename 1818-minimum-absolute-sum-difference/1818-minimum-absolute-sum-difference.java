class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int modulo = 1000000007;
        int maxSub = 0;
        long finalSum = 0;

        int[] arr = nums1.clone();
        Arrays.sort(arr);

        for (int i = 0; i < nums1.length; i++) {
            int sub = Math.abs(nums1[i] - nums2[i]);
            finalSum += sub;

            int nearest = binarySearch(arr, nums2[i]);
            int newSub = Math.abs(nearest - nums2[i]);

            maxSub = Math.max(maxSub, sub - newSub);
        }

        return (int)((finalSum - maxSub) % modulo);
    }

    public int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return arr[mid];
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        if (start >= arr.length) return arr[arr.length - 1];
        if (end < 0) return arr[0];

        return Math.abs(arr[start] - target) < Math.abs(arr[end] - target)
                ? arr[start]
                : arr[end];
    }
}
