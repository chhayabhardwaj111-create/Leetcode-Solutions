class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr1 = new int[26];
        int sum = 0;

        for (int i = 0; i < chars.length(); i++) {
            arr1[chars.charAt(i) - 'a']++;
        }

        for (int i = 0; i < words.length; i++) {
            int[] arr2 = new int[26];
            String word = words[i];
            boolean canMake = true;

            for (int j = 0; j < word.length(); j++) {
                arr2[word.charAt(j) - 'a']++;
            }

            for (int k = 0; k < 26; k++) {
                if (arr2[k] > arr1[k]) {
                    canMake = false;
                    break;
                }
            }

            if (canMake) {
                sum += word.length();
            }
        }

        return sum;
    }
}
