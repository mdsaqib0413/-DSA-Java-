class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int x=nums[0];
        int c=1;
        for(int i=1; i<n; i++){
            if(nums[i]==x){
                c++;
            }else{
                if(c>n/3) res.add(x);
                x=nums[i];
                c=1;
            }
        }
        if(c>n/3) res.add(x);
        return res;
    }
}