import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int i=0,l=nums.length;
        // int[] x=new int[l];
        BigInteger[] x = new BigInteger[l];
        for(i=0;i<l;i++){
            x[i]=new BigInteger(nums[i]);
            // x[i]=Integer.parseInt(nums[i]);
        }
        Arrays.sort(x);
        return ""+x[l-k];
    }
}