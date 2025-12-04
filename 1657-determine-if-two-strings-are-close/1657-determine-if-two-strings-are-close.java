class Solution {
    public boolean closeStrings(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] f1 = new int[26], f2 = new int[26];

        for (char c : a.toCharArray()) f1[c - 'a']++;
        for (char c : b.toCharArray()) f2[c - 'a']++;

        for (int i = 0; i < 26; i++)
            if ((f1[i] == 0) != (f2[i] == 0))
                return false;

        Arrays.sort(f1);
        Arrays.sort(f2);

        return Arrays.equals(f1, f2);
    }
}
