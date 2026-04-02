import java.util.StringTokenizer;
class Solution {
    public int lengthOfLastWord(String s) {
        int x=0;
        StringTokenizer st=new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            x=st.nextToken().length();
        }
        return x;
    }
}