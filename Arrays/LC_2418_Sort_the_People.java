class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                if(heights[i]<heights[j]){
                    int t1=heights[i];
                    String t2=names[i];
                    names[i]=names[j];
                    heights[i]=heights[j];
                    names[j]=t2;
                    heights[j]=t1;
                }
            }
        }
        return names;
    }
}