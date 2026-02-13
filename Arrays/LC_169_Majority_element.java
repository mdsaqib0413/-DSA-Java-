class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i];
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        int[] farr=new int[k];
        for(int i=0; i<k; i++){
            farr[i]=arr[i];
        }
        int[] co=new int[k];
        for(int i=0; i<k; i++){
            for(int j=0; j<nums.length; j++){
                if(farr[i]==nums[j]){
                    co[i]++;
                }
            }
        }
        int mx=0;
        int res=0;
        for(int i=0; i<k; i++){
            if(mx<co[i]){
                mx=co[i];
                res=farr[i];
            }
        }
        return res;
    }
}