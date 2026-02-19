import java.lang.Math;
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger n=n1.multiply(n2);
        String num=String.valueOf(n);
        return num;
    }
}