class Solution {
    public boolean hasAlternatingBits(int n) {
        String sc = Integer.toBinaryString(n);
        for(int i = 1; i < sc.length(); i++){
            if(sc.charAt(i) == sc.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}