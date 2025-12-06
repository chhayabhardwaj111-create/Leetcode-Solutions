class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[52];
        int count = 0;
        boolean oddFound = false;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') freq[c - 'a']++;
            else if (c >= 'A' && c <= 'Z') freq[c - 'A' + 26]++;
        }

        for (int f : freq) {
            count += (f / 2) * 2;
            if (f % 2 == 1) oddFound = true;
        }

        return oddFound ? count + 1 : count;
    }
}
