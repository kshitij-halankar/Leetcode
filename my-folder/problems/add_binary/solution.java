import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger x=new BigInteger(a,2);
        BigInteger y=new BigInteger(b,2);
        BigInteger z=x.add(y);
        return z.toString(2);
    }
}