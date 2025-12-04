class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        char[] arr = directions.toCharArray();

        int i = 0;
        int j = n - 1;

        while(i < n && arr[i] == 'L')i++;

        while(j >= 0 && arr[j] == 'R')j--;

        int col = 0;

        for(int k = i; k <= j; k++){
            if(arr[k] != 'S')col++;

        }
        return col;

        
    }
}