class Solution {
    public int[] runningSum(int[] nums) {
        int i=0, l=nums.length;
        for(i=1;i<l;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}