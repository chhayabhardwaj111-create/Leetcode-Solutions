class Solution {
    public int minDeletions(String s) {

        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (seen.contains(c)) continue;
            seen.add(c);

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) count++;
            }

            arr.add(count);
        }

        Collections.sort(arr, Collections.reverseOrder());

        HashSet<Integer> used = new HashSet<>();
        int deletions = 0;

        for (int f : arr) {
            while (f > 0 && used.contains(f)) {
                f--;
                deletions++;
            }
            if (f > 0) used.add(f);
        }

        return deletions;
    }
}
