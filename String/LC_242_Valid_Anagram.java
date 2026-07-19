class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(m!=n) return false;
        char[] sA=s.toCharArray();
        char[] tA=t.toCharArray();
        Arrays.sort(sA);
        Arrays.sort(tA);
        for(int i=0; i<m; i++){
            if(sA[i]!=tA[i]) return false;
        }
        return true;
    }
}
