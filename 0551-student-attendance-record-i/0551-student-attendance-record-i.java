class Solution {
    public boolean checkRecord(String s) {
        int conlate = 0;
        int pre = 0, late = 0, abs = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                abs++;
                if(abs >= 2) return false;
                conlate = 0;
            }else if(s.charAt(i) == 'L'){
                conlate++;
                late++;
                if(conlate >= 3)return false;
            }else{
                pre++;
                conlate = 0;
            }
        }
        return true;
    }
}