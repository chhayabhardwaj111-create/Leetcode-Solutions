class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                sum += nums[i];
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (sum == nums[i]) {
                sum++;
            }
        }
        return sum;
    }
}