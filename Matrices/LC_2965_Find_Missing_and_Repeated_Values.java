class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] res=new int[2];
        int[] arr=new int[n*n];
        int x=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[x]=grid[i][j];
                x++;
            }
        }
        Arrays.sort(arr);
        HashSet<Integer>  h=new HashSet<>();
        for(int i=0; i<n*n; i++) h.add(arr[i]);
        for(int i=1; i<=n*n; i++){
            if(h.contains(i)) continue;
            res[1]=i;
            break;
        }
        for(int i=0; i<n*n; i++){
            if(arr[i]==arr[i+1]){
                res[0]=arr[i];
                break;
            }
        }
        return res;
    }
}