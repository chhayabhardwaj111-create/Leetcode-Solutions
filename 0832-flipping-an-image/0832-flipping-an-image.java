class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0, end = image.length - 1;

        while(start <= end){
            int temp = image[i][end];
            image[i][end] = image[i][start] ^ 1;
            image[i][start] = temp ^ 1;
            start++;
            end--;
        }
        }
        return image;
       
    }
}