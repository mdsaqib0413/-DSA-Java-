import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] merged=new double[nums1.length+nums2.length];
        int n=merged.length;
        for(int i=0; i<n; i++){
            if(i<nums1.length){
                merged[i]=nums1[i];
            }else{
                merged[i]=nums2[i-nums1.length];
            }
        }
        Arrays.sort(merged);
        if(n%2==0){
            return (merged[n/2-1]+merged[n/2])/2;
        }
        else return merged[n/2];
    }
}