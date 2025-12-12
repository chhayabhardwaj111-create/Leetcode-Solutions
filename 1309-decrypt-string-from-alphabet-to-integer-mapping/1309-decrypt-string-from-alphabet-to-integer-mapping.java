class Solution {
    public String freqAlphabets(String s) {
        char[] arr = new char[s.length()];
        int w = arr.length - 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                String sc = s.substring(i - 2, i);
                int num = Integer.parseInt(sc);
                char scs = (char)(num + 96);
                arr[w--] = scs;
                i -= 2;
            } else {
                int num = s.charAt(i) - '0';
                char scs = (char)(num + 96);
                arr[w--] = scs;
            }
        }

        return new String(arr, w + 1, arr.length - (w + 1));
    }
}
