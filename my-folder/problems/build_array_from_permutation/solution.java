class Solution {
    public int[] buildArray(int[] nums) {
        int i=0, n=nums.length;
        int[] ans = new int[n];
        for(i=0;i<n;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}