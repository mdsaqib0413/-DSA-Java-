class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> fr=new ArrayList<>();
        for(int x: friends){
            fr.add(x);
        }
        int n=friends.length;
        int[] res=new int[n];
        int k=0;
        for(int x: order){
            if(fr.contains(x)){
                res[k]=x;
                k++;
            }
        }
        return res;
    }
}