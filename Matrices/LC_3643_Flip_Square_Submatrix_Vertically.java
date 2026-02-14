class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n=grid.length, m=grid[0].length;
        for(int i=x; i<x+k/2; i++){
            for(int j=y; j<y+k; j++){
                int temp=grid[i][j];
                grid[i][j]=grid[2*x+k-1-i][j];
                grid[2*x+k-i-1][j]=temp;
            }
        }
        return grid;
    }
}