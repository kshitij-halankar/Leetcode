class Solution {
    public int maxProductDifference(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        return (nums[l-1] * nums[l-2]) - (nums[0] * nums[1]);
    }
}