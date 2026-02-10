class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ns=new int[mat.length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1){
                    ns[i]++;
                }
            }
        }
        int[] ins=new int[mat.length];
        for(int i=0; i<mat.length; i++){
            ins[i]=i;
        }
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat.length; j++){
                if(ns[i]>ns[j] || (ns[i]==ns[j] && ins[i]>ins[j])){
                    int temp=ns[i];
                    int t=ins[j];
                    ins[j]=ins[i];
                    ins[i]=t;
                    ns[i]=ns[j];
                    ns[j]=temp;
                }
            }
        }
        int[] res=new int[k];
        for(int i=0; i<k; i++){
            res[i]=ins[i];
        }
        return res;
    }
}