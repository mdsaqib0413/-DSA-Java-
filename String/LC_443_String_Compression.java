import java.util.HashMap;
class Solution {
    public int compress(char[] chars) {
        String s="";
        char x=chars[0];
        int c=1;
        int n=chars.length;
        for(int i=1; i<n; i++){
            if(chars[i]==x){
                c++;
            }else{
                s += x;
                if (c > 1) s += String.valueOf(c);
                x=chars[i];
                c=1;
            }
        }
        s += x;
        if (c > 1) s += String.valueOf(c);
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}