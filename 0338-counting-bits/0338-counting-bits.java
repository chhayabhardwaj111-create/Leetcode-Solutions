class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int idx = i;
            while(idx > 0){
                if((idx & 1) == 1){
                    count ++;
                }
                idx = idx >> 1;
            }
            arr[i] = count;
        }

        return arr;
    }
}