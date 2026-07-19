import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> H=new HashMap<>();
        int[] sol=new int[2];
        int n=nums.length;
        for(int i=0; i<n; i++){
            H.put(nums[i], i);
        }
        for(int i=0; i<n; i++){
            int x=target-nums[i];
            if(H.containsKey(x) && H.get(x)!=i){
                sol[0]=H.get(x);
                sol[1]=i;
                return sol;
            }
        }
        return sol;
    }
}