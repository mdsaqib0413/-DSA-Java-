class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int p=1;
        int p1=1;
        int c=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                p1*=nums[i];
                c++;
                continue;
            }
            p*=nums[i];
            p1*=nums[i];
        }
        for(int i=0; i<n; i++){
            if(nums[i]==0 && c==1){
                res[i]=p;
                continue;
            }
            if(nums[i]==0 && c>1){
                res[i]=0;
                continue;
            }
            res[i]=p1/nums[i];
        }
        return res;
    }
}