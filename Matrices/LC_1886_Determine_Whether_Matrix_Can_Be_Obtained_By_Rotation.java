class Solution {
    public int[][] rotate(int[][] mat, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){
            int left=0, right=n-1;
            while(left<right){
                int temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
        return mat;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        for(int i=0; i<4; i++){
            boolean same=true;
            for(int k=0; k<n; k++){
                for(int j=0; j<n; j++){
                    if(mat[k][j]!=target[k][j]){
                        same=false;
                        break;
                    };
                }
                if(!same) break;
            }
            if(same) return true;
            rotate(mat, n);
        }
        return false;
    }
}