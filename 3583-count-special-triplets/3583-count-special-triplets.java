class Solution {
    public int specialTriplets(int[] nums) {

        int num = 1_000_000_007;
        long triplet = 0;

        for(int idx = 0; idx < nums.length; idx++){            
            int pre = 0;
            int suc = 0;
        
            for(int i = 0; i < nums.length; i++){  

                if(nums[i] == 2*nums[idx] && i < idx){
                    pre++;
                }else if(nums[i] == 2*nums[idx] && i > idx){
                    suc++;
                }
            }

            triplet += (pre * suc) %num;
        }

        return (int)triplet;
    }
}