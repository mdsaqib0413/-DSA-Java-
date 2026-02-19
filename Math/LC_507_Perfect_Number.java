class Solution {
    public boolean checkPerfectNumber(int num) {
        int a=num;
        int arr=0;
        for(int i=1; i<=num/2; i++){
            if(a%i==0){
                arr+=i;
                continue;
            }
        }
        if(arr==num){
            return true;
        }return false;
    }
}