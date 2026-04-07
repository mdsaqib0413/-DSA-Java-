class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int s=nums.length;
        int[] res=new int[s];
        int i=0;
        for(int n:nums){
            if(n<pivot){
                res[i]=n;
                i++;
            }
        }
        for(int n:nums){
            if(n==pivot){
                res[i]=n;
                i++;
            }
        }
        for(int n:nums){
            if(n>pivot){
                res[i]=n;
                i++;
            }
        }
        return res;
    }
}