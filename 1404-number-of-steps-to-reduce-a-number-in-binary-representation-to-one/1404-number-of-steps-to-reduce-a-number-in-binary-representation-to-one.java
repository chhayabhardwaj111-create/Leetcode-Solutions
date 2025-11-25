class Solution {
    public int numSteps(String s) {
        int num = Integer.parseInt(s, 2); 
        int count = 0;

        while(num != 1){
            if(num % 2 == 0){
                num/=2;
            }else{
                num += 1;
            }
            count++;
        }
        return count;
    }
}