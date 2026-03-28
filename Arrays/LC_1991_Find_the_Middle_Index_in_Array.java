class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        int suml=0;
        int sumr=0;
        for(int i=0; i<n; i++){
            sumr=sum-suml-nums[i];
            if(sumr==suml) return i;
            suml+=nums[i];
        }
        return -1;
    }
}