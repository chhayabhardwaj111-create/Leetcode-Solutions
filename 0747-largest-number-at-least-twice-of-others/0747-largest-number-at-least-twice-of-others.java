class Solution {
    public int dominantIndex(int[] nums) {
        int great = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > great){
                great = nums[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i != maxIndex && nums[i]*2 > great){
                return -1;
            }
        }
        return maxIndex;
    }
}