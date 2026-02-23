class Solution {
    public String reversePrefix(String word, char ch) {
        String x=word;
        int c=0;
        for(char e: x.toCharArray()){
            if(e==ch){
                break;
            }c++;
        }
        if(c == word.length()) return word;
        String ans=new StringBuilder(word.substring(0, c+1)).reverse().toString();
        return ans+word.substring(c+1);
    }
}