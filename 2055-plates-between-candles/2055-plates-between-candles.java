class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] prefix = new int[n + 1];
        int[] left = new int[n];
        int[] right = new int[n];
        
      
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (s.charAt(i) == '*' ? 1 : 0);
        }

        //candle to the left
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '|') last = i;
            left[i] = last;
        }

        //candle to the right
        last = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '|') last = i;
            right[i] = last;
        }

        // Answer
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = right[queries[i][0]];
            int r = left[queries[i][1]];
            if (l != -1 && r != -1 && l < r) {
                ans[i] = prefix[r] - prefix[l];
            }
        }
        return ans;
    }
}
