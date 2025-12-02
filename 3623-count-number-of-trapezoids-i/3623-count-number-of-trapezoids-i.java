import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    public int countTrapezoids(int[][] points) {

        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));

        List<Long> newList = new ArrayList<>();
        int n = points.length;
        int i = 0;

        while(i < n){
            int j = i;
            long count = 0;

            while(j < n && points[j][1] == points[i][1]){
                count++;
                j++;
            }

            if (count >= 2) {
                newList.add(count * (count - 1) / 2);
            }

            i = j;
        }

        long ans = 0;
        long prefixSum = 0;

        for (long p : newList) {
            ans = (ans + p * prefixSum % MOD) % MOD;
            prefixSum = (prefixSum + p) % MOD;
        }

        return (int) ans;
    }              
}
