import java.util.*;
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] row=new int[m];
        int[] col=new int[n];
        int x=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                x=Math.max(x, matrix[i][j]);
            }
        }
        x++;
        for(int i=0; i<m; i++) row[i]=x;
        for(int i=0; i<m; i++){
            for(int j: matrix[i]){
                row[i]=Math.min(row[i], j);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                col[i]=Math.max(col[i], matrix[j][i]);
            }
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(col[j]==row[i]){
                    l.add(col[j]);
                }
            }
        }
        return l;
    }
}