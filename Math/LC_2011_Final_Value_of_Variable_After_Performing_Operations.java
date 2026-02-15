class Solution {
    public int finalValueAfterOperations(String[] operations) {
        String s1="++X";
        String s2="--X";
        String s3="X++";
        String s4="X--";
        int res=0;
        for(String s:operations){
            if(s.equals(s1)) ++res;
            if(s.equals(s2)) --res;
            if(s.equals(s3)) res++;
            if(s.equals(s4)) res--;
        }
        return res;
    }
}