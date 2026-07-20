class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int x=arr[n-1];
        int[] res=new int[n];
        res[n-1]=-1;
        for(int i=n-2; i>=0; i--){
            x=Math.max(arr[i+1], x);
            res[i]=x;
        }
        return res;
    }
}
