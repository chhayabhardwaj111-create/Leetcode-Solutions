class Solution {
    public String interpret(String command) {
        StringBuilder sc= new StringBuilder();
        int i = 0;
        while(i < command.length()){
            if(command.charAt(i) == 'G'){
                sc.append('G');
                i++;
            }else if(command.charAt(i) == '(' && command.charAt(i + 1) == 'a'){
                sc.append("al");
                i+=4;
            }else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                sc.append('o');
                i+=2;
            }
        }

        String ans = sc.toString();

        return ans;
    }
}