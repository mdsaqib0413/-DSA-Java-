import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=0;
        for(int i=0; i<n;i++){
            if(a!=nums[i]){
                return a;
            }
            a++;
        }
        return 1+nums[n-1];
    }
}