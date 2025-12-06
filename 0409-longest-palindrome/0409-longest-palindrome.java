class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        int count = 0;

        for (char c : s.toCharArray()) freq[c]++;

        for (int f : freq) count += (f / 2) * 2;

        return count < s.length() ? count + 1 : count;
    }
}
