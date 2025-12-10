class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sc = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                sc.append("[.]");
            }else{
                sc.append(address.charAt(i));
            }
        }

        String ans = sc.toString();
        return ans;
    }
}