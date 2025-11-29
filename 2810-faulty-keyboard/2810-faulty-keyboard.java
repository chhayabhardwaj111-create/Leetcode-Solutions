class Solution {
    public String finalString(String s) {
        char[] arr = new char[s.length()];
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'i') {
                reverse(arr, 0, idx - 1);  
            } else {
                arr[idx] = s.charAt(i);
                idx++;
            }
        }

        return new String(arr, 0, idx);       
    }

    public char[] reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
