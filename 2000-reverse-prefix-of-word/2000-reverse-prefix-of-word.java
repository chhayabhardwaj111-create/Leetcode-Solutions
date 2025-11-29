class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {    
                reverse(0, i, arr);
                break;                
            }
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
