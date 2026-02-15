class Solution {
    public String reversePrefix(String s, int k) {
        String sub11="";
        String sub1=s.substring(0, k);
        String sub2=s.substring(k);
        for(int i=0; i<sub1.length(); i++){
            sub11=sub1.charAt(i)+sub11;
        }
        return sub11+sub2;
    }
}