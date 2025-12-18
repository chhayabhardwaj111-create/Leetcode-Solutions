class Solution {
    public int binaryGap(int n) {
        String sc = Integer.toBinaryString(n);

        int count = 0;
        int ans = 0;
        int mover = 0;

        for(int i = 0; i < sc.length(); i++){
            if(sc.charAt(i) == '1'){
                for(int j = i+1; j < sc.length(); j++){
                    if(sc.charAt(j) == '1'){
                        ans = Math.max(ans, j - i);
                        i = j;
                    }
                }                
            }
        }
        return ans;        
    }
}