import java.lang.Math;
import java.util.Stack;
class Solution {
    public boolean isPalindrome(long x) {
        if(x<0) return false;
        long og=x;
        long rev=0;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        return og==rev;
    }
}