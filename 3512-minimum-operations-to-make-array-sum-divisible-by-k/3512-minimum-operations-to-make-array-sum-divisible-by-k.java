class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int num = sum % k;

        if(num == 0){
            return 0;
        }

        if(sum < k){
            return sum;
        }
        return num;
    }
}