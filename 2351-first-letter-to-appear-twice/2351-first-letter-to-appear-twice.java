class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            int idx = c - 'a';

            if (freq[idx] == 1)
                return c;

            freq[idx]++;
        }

        return ' ';
    }
}
