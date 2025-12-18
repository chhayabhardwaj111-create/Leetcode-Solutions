class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int ans = ;

        for(int i = 0; i < n; i++){
            arr[i] = start + 2 * i;
            ans ^= arr[i];
        }
        return ans;
    }
}