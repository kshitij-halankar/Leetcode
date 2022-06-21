class Solution {
    public int singleNumber(int[] nums) {
        int i=0,l=nums.length,c=0;
        for(i=0;i<l;i++){
            c^=nums[i];
        }
        return c;
    }
}
