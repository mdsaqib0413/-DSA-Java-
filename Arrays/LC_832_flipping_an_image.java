class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr=new int[image.length][image[0].length];
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                arr[i][j]=image[i][image[0].length-1-j];
            }
        }
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                if(arr[i][j]==0) arr[i][j]=1;
                else arr[i][j]=0;
            }
        }
        return arr;
    }
}