class Solution {
    public char findTheDifference(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        for(int i=0; i<s.length(); i++){
            if(sarr[i]==tarr[i]){
                continue;
            }return tarr[i];
        }
        return tarr[t.length()-1];
    }
}