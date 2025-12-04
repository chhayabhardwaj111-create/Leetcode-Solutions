class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> ans = new ArrayList<>();

        for (String w : words) {
            String s = w.toLowerCase();
            int rowIndex = -1;
            for (int i = 0; i < 3; i++)
                if (rows[i].indexOf(s.charAt(0)) != -1) rowIndex = i;

            boolean ok = true;
            for (char c : s.toCharArray())
                if (rows[rowIndex].indexOf(c) == -1) { ok = false; break; }

            if (ok) ans.add(w);
        }

        return ans.toArray(new String[0]);
    }
}
