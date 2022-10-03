import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i=0, l=num.length;
        BigInteger c = new BigInteger(""+i);
        for(i=0;i<l;i++){
            c=c.multiply(new BigInteger("10"));
            BigInteger b = new BigInteger(""+num[i]);
            c=c.add(new BigInteger(""+num[i]));
        }
        c=c.add(new BigInteger(""+k));
        // System.out.println(c);
        // c+=k;
        // int[] x=Long.toString(c).chars().map(a -> a-'0').toArray();
        String s = c.toString();
        List<Integer> n = new ArrayList<>();
        for(i=0;i<s.length();i++){
            n.add(Character.getNumericValue(s.charAt(i)));
        }
        return n;
    }
}