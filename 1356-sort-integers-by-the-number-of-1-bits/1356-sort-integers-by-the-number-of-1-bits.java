class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(setBits(arr[i]) > setBits(arr[j])){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }else if(setBits(arr[i]) == setBits(arr[j]) && arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
        
    }
    public int setBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}