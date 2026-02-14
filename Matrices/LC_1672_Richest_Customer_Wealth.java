class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0; i<accounts.length; i++){
            int x=0;
            for(int n: accounts[i]){
                x+=n;
            }
            max=Math.max(max, x);
        }
        return max;
    }
}