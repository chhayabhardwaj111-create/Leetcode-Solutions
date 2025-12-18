class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int ans = x ^ y;
        while( ans > 0){
            if((ans & 1) == 1){
                count++;
            }
            ans = ans >> 1;
        }
        return count;
    }
}