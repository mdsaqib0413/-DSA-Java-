class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==1) return;
        if(k>n) k=k%n;
        if(k==0) return;
        int[] x=new int[n];
        int i=0;
        for(i=0; i<k; i++){
            x[i]=nums[n-k+i];
        }
        int d=0;
        for(int j=i; j<n; j++){
            x[j]=nums[d];
            d++;
        }
        for(i=0; i<n; i++){
            nums[i]=x[i];
        }
    }
}