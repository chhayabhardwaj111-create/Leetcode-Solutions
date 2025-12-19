class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> set1  = new HashSet<>();

        for(int i = 0; i < allowed.length(); i++){
            set1.add(allowed.charAt(i));
        }

        for(int i = 0; i < words.length; i++){
            String sc = words[i];
            HashSet<Character> set2  = new HashSet<>();
            for(int j = 0; j < sc.length(); j++){
                set2.add(sc.charAt(j));
            }
            if(set1.containsAll(set2))count++;
        }
        return count;
    }
}