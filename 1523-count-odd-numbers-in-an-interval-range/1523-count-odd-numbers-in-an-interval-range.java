class Solution {
    public int countOdds(int low, int high) {
        int count = high - low + 1;

        if( count % 2 != 0){
            if(high % 2 != 0 || low % 2 != 0){
                return count/2 + 1;
            }
        }
        return count/2;
    }
}