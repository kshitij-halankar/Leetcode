import java.lang.Integer;
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int i=0, n=nums.size(), s=0;
        for(i=0; i<n; i++) {
            if(Integer.bitCount(i) == k) {
                s += nums.get(i);
            } 
        }
        return s;
    }
}