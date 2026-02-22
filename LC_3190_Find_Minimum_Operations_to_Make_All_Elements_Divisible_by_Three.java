class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int x=0;
        for(int i=0; i<n; i++){
            if(nums[i]%3==0) continue;
            int r=nums[i]%3;
            x+=Math.min(r, 3-r);
        }
        return x;
    }
}