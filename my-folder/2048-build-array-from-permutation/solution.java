class Solution {
    public int[] buildArray(int[] nums) {
        int i = 0;
        int l = nums.length;
        int[] b = new int[l];
        for (i = 0; i < l; i++) {
            b[i] = nums[nums[i]];
        }
        return b;
    }
}
