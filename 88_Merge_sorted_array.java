class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m; i<n+m; i++){
            nums1[i]=nums2[j];
            j++;
        }
        for(int i=0; i<m+n; i++){
            for(j=i+1; j<m+n; j++){
                if(nums1[i]>nums1[j]){
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
}