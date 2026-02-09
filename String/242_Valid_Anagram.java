class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] as=s.toCharArray();
        char[] ts=t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(ts);
        for(int i=0; i<s.length(); i++){
            if(as[i]!=ts[i]){
                return false;
            }
        }
        return true;
    }
}