class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i = 0; i < bits.length;){
            if(bits[i] == 1){
                i+=2;
            }else if(bits[i] == 0 && i+1 >= bits.length){
                return true;
            } else {
                i+=1;
            }
        }
        return false;
    }
}