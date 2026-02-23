class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates[0][0]==0 && coordinates[1][0]==0 && coordinates[2][0]==0){
            return true;
        }
        for(int i=0; i<coordinates.length-2; i++){
            double m1, m2;
            m1=(double)(coordinates[i][1]-coordinates[i+1][1])/(coordinates[i][0]-coordinates[i+1][0]);

            m2=(double)(coordinates[i+1][1]-coordinates[i+2][1])/(coordinates[i+1][0]-coordinates[i+2][0]);

            if(Double.isNaN(m1) || Double.isNaN(m2))
                continue;

            if(m1!=m2){
                return false;
            }
        }
        return true;
    }
}