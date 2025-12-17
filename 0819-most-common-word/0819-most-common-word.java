class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String ans = "";
        int max = 0;

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        HashSet<String> set = new HashSet<>();
        for (String b : banned) set.add(b);

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (!set.contains(w)) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}
