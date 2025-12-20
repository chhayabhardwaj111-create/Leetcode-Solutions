class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        List<Integer> li = new ArrayList<>();
        int xor = 0;
        int ans = 0;
        
        for(int i = 0; i < arr2.length; i++){
            xor ^= arr2[i];
        }
        
        for(int i = 0 ; i < arr1.length; i++){
            li.add(arr1[i] & xor);
        }

        for(int i = 0; i < li.size(); i++){
            ans ^= li.get(i);
        }

        return ans;
    }
}