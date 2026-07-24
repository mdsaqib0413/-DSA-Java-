class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1 || n==4) return true;
        if(n<=0 || n%4!=0) return false;
        boolean x=isPowerOfFour(n/4);
        return x;
    }
}