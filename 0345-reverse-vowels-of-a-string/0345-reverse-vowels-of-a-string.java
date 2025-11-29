class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if ("aeiouAEIOU".indexOf(arr[left]) != -1 &&
                "aeiouAEIOU".indexOf(arr[right]) != -1) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            if ("aeiouAEIOU".indexOf(arr[left]) == -1) {
                left++;
            }

            if ("aeiouAEIOU".indexOf(arr[right]) == -1) {
                right--;
            }
        }

        return new String(arr);
    }
}
