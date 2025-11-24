class Solution {
    public int maxSumDivThree(int[] nums) {
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        int totalsum = 0;
        for(int i = 0; i < nums.length; i++){
            totalsum += nums[i];
            if(nums[i] % 3 == 1){
                one.add(nums[i]);
            } else if(nums[i] % 3 == 2){
                two.add(nums[i]);
            }
        }

        Collections.sort(one);
        Collections.sort(two);

        int remainder = totalsum % 3;

        if(remainder == 0){
            return totalsum;
        }

        int remove1 = Integer.MAX_VALUE;
        int remove2 = Integer.MAX_VALUE;

        if(remainder == 1){
            if(one.size() >= 1){
                remove1 = one.get(0);
            }
            if(two.size() >= 2){
                remove2 = two.get(0) + two.get(1);
            }
        }else if(remainder == 2){
            if(two.size() >= 1){
                remove1 = two.get(0);
            }
            if(one.size() >= 2){
                remove2 = one.get(0) + one.get(1);
            }
        }

        return totalsum - Math.min(remove1, remove2);
    }
}
