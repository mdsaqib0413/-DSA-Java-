class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        res[0]=0;
        for(int i=1; i<=n; i++){
            res[i]=0;
            int x=i;
            while(x>0){
                if(x%2==1){
                    res[i]++;
                }
                x/=2;
            }
        }
        return res;
    }
}