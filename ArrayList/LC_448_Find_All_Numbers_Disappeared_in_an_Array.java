class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=nums.length;
        boolean[] b=new boolean[n];
        Arrays.sort(nums);
        for(int i: nums){
            b[i-1]=true;
        }
        for(int i=0; i<n; i++){
            if(!b[i]) l.add(i+1);
        }
        return l;
    }
}