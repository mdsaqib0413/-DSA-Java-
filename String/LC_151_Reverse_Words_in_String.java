import java.util.Stack;
import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        StringTokenizer sT=new StringTokenizer(s);
        while(sT.hasMoreTokens()) st.push(sT.nextToken());
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}