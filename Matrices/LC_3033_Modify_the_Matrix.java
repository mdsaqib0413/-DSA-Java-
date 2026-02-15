class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] cmax=new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                cmax[i]=Math.max(cmax[i], matrix[j][i]);
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=cmax[j];
                }
            }
        }
        return matrix;
    }
}