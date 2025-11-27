class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < target.length(); i++) {
            arr2[target.charAt(i) - 'a']++;
        }
        
        int min =  Integer.MAX_VALUE;

        for(int i = 0; i < 26; i++){
            if(arr2[i] > 0){
                min = Math.min(min, arr1[i]/arr2[i]);
            }
        }
        return min;
    }
}