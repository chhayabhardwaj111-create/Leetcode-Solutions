class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> li = new ArrayList<>();

        for(int mask = 0; mask < (1 << nums.length); mask++ ){
            List<Integer> line = new ArrayList<>();

            for(int i = 0; i < nums.length ; i++){
                if((mask & (1 << i)) != 0){
                    line.add(nums[i]);
                }
            }
            li.add(line);
        }

        return li;
        
    }
}