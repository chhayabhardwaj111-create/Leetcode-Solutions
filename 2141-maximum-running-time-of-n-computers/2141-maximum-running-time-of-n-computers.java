class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) {
            sum += b;
        }

        long start = 0;
        long end = sum / n;

        while (start < end) {
            long mid = (start + end + 1) / 2;
            if (possible(mid, n, batteries)) {
                start = mid;      
            } else {
                end = mid - 1;    
            }
        }

        return start;
    }

    public boolean possible(long t, int n, int[] batteries) {
        long total = 0;
        for (long b : batteries) {
            total += Math.min(b, t);
        }
        return total >= t * n;
    }
}
