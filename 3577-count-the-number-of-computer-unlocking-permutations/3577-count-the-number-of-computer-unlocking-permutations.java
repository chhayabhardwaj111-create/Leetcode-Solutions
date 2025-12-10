class Solution {
    public int countPermutations(int[] complexity) {

        int modulo = 1000000007;
        int fixed = complexity[0];

        for(int i = 1; i < complexity.length; i++){
            if(complexity[i] <= fixed){
                return 0;
            }
        }

        return (factorial(complexity.length - 1, modulo));
    }

    private int factorial(int n, int modulo){
        if(n == 0){
            return 1;
        }

        long res = factorial(n-1, modulo);
        res = (res * n) % modulo;

        return (int)res;
    }
}