class Solution {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if((int)(arr[i]) >= 65 && (int)(arr[i]) <= 90){
                arr[i] = (char)((int)(arr[i]) + 32);
            }
        }
        return new String(arr);
    }
}