class Solution {
    public boolean judgeCircle(String moves) {
        boolean vertical = false;
        boolean horizontal = false;
        int up = 0;
        int down = 0; 
        int right = 0; 
        int left = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                up++;
            }else if(moves.charAt(i) == 'D'){
                down++;
            }else if(moves.charAt(i) == 'R'){
                right++;
            }else{
                left++;
            }
        }
        if(up == down){
            vertical = true;
        }
        if(right == left){
            horizontal = true;
        }

        if(horizontal == true && vertical == true){
            return true;
        }

        return false;

    }
}