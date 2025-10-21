class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int pos = 0;
        int jump = 1;

        while (pos < target || (pos - target) % 2 != 0) {
            pos += jump;
            jump++;
        }

        return jump - 1;
    }
}
