class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0, right = arr.length - 1;

        while (left < right) {

            if ( ((arr[left] >= 'a' && arr[left] <= 'z') || (arr[left] >= 'A' && arr[left] <= 'Z')) 
              && ((arr[right] >= 'a' && arr[right] <= 'z') || (arr[right] >= 'A' && arr[right] <= 'Z')) ) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            else if (!((arr[left] >= 'a' && arr[left] <= 'z') || 
                       (arr[left] >= 'A' && arr[left] <= 'Z'))) {
                left++;
            }

            else {
                right--;
            }
        }

        return String.valueOf(arr);
    }
}
