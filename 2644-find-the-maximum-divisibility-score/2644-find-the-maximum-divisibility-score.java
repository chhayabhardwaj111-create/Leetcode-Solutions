class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int[] arr = new int[divisors.length];
        int count1 = 0;
        for(int i = 0; i < divisors.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] % divisors[i] == 0){
                    count1++;
                }
            }
            arr[i] = count1;
            count1 = 0;           
        }
        int max = -1;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max || arr[i] == max && divisors[i] < ans){
                max = arr[i];
                ans = divisors[i];
            }
        }
        return ans;
    }
}