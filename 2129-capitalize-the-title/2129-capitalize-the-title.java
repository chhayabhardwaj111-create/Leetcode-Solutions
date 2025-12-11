class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();

            if (arr.length <= 2) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = Character.toLowerCase(arr[j]);
                }
            } else {
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = Character.toLowerCase(arr[j]);
                }
                arr[0] = Character.toUpperCase(arr[0]);
            }

            words[i] = new String(arr);
        }

        return String.join(" ", words);
    }
}
