class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows=new HashSet<>();
        Set<Integer> cols=new HashSet<>();
        int m=matrix.length, n=matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int x:rows){
            for(int j=0; j<n; j++){
                matrix[x][j]=0;
            }
        }
        for(int x:cols){
            for(int j=0; j<m; j++){
                matrix[j][x]=0;
            }
        }
    }
}