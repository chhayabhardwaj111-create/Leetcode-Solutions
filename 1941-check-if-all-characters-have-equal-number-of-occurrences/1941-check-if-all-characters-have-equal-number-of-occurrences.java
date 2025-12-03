class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }

        int check = -1;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                if (check == -1) {
                    check = arr[i];        
                } else if (arr[i] != check) {
                    return false;         
                }
            }
        }

        return true;  
    }
}
