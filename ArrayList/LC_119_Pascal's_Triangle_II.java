class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> l=new ArrayList();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> row=new ArrayList();
            for(int j=0; j<i+1; j++){
                if(j==0  || j==i){
                    row.add(1);
                    continue;
                }
                int val=l.get(i-1).get(j-1)+l.get(i-1).get(j);
                row.add(val);
            }
            l.add(row);
        }
        List<Integer> res=new ArrayList();
        res=l.get(rowIndex);
        return res;
    }
}