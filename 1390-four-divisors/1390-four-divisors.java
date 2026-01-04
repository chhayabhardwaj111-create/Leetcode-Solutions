class Solution {
    public int sumFourDivisors(int[] nums) {
        int finalSum = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = 0;
            int sum = 0;
            for(int j = 1; j <= num; j++){
                if(num < 2)break;
                if(num % j == 0){
                    count++;
                    sum += j;
                    if(count > 4){
                        break;
                    }
                }
            }
            if(count == 4)finalSum += sum;
        }  

        return finalSum;    
    }
}