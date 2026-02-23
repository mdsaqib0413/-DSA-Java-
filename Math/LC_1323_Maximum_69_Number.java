import java.lang.Math;
class Solution {
    public int maximum69Number (int num) {
        int[] arr=new int[4];
        int x=num;
        for(int i=3; i>=0; i--){
            arr[i]=x%10;
            x/=10;
        }
        for(int i=0; i<4; i++){
            if(arr[i]==6){
                arr[i]=9;
                break;
            }
        }
        x=0;
        for(int i=0; i<4; i++){
            x+=arr[i]*Math.pow(10, 3-i);
        }
        return x;
    }
}