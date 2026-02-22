class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int s=0;
        for(int i=0; i<n; i++){
            s+=nums[i];
        }
        int rem=s%k;
        return rem;
    }
}