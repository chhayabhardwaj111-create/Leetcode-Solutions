class Solution {
    public boolean halvesAreAlike(String s) {
        String sc = s.toLowerCase();

        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < sc.length()/2; i++){
            if((int)(sc.charAt(i))== 97 || (int)(sc.charAt(i))== 101 || (int)(sc.charAt(i))== 105 || (int)(sc.charAt(i))== 111 || (int)(sc.charAt(i))== 117){
                count1++;
            }
        }
        for(int i = sc.length()/2; i < sc.length(); i++){
            if((int)(sc.charAt(i))== 97 || (int)(sc.charAt(i))== 101 || (int)(sc.charAt(i))== 105 || (int)(sc.charAt(i))== 111 || (int)(sc.charAt(i))== 117){
                count2++;
            }
        }

        if(count1 == count2)return true;

        return false;
    }
}