class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < word1.length(); i++){
            arr1[word1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < word2.length(); i++){
            arr2[word2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(arr1[i] == 0) continue;

            for(int j = 0; j < 26; j++){
                if(arr2[j] == 0) continue;

                arr1[i]--; 
                arr2[j]--;
                arr1[j]++;
                arr2[i]++;

                if(Distinct(arr1) == Distinct(arr2)){
                    return true;
                }

                arr1[i]++; 
                arr2[j]++;
                arr1[j]--;
                arr2[i]--;
            }
        }
        return false;
    }

    public int Distinct(int[] arr){
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(arr[i] > 0){
                count++;
            }
        }
        return count;
    }
}
