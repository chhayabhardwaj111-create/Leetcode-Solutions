class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] temp = new int[n][2];
        int[] arr = new int[k];

        for(int i = 0; i < n; i++){
            temp[i][0] = nums[i];
            temp[i][1] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temp[i][0] > temp[j][0]) { 
                    int[] t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }

        int[][] topK = new int[k][2];
        for(int i = 0; i < k; i++){
            topK[i] = temp[n - k + i];
        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (topK[i][1] > topK[j][1]) {
                    int[] t = topK[i];
                    topK[i] = topK[j];
                    topK[j] = t;
                }
            }
        }

        for(int i = 0; i < k; i++){
            arr[i] = topK[i][0];
        }

        return arr;
    }
}
