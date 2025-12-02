class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();   

        List<Character> num = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                num.add(arr[i]); 
            }
        }

        Collections.sort(num);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                arr[i] = num.get(count++); 
            }
        }

        return new String(arr);
    }
}
