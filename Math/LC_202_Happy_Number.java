class Solution {
    public int sumod(int n){
        int r=0;
        while(n!=0){
            r+=(n%10)*(n%10);
            n/=10;
        }
        return r;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> x=new HashSet<>();
        x.add(n);
        while(n!=1){
            n=sumod(n);
            if(x.contains(n)) return false;
            x.add(n);
        }
        return true;
    }
}