class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(k > 0){
                if(nums[i] < 0){
                    nums[i] = -nums[i];
                    k--;
                }
            }
        }

        int min = nums[0];
        for(int num : nums){
            if(num < min) min = num;
        }

        if(k % 2 == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == min){
                    nums[i] = -nums[i];
                    break;
                }
            }
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;

    }
}