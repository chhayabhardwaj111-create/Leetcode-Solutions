class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0;

        while (i < arr.length) {
            int left = i;
            while (i < arr.length && arr[i] != ' ') i++;
            reverse(left, i - 1, arr);
            i++;
        }

        return new String(arr);
    }

    public void reverse(int left, int right, char[] arr) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
