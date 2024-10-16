class Solution {
    public boolean canAliceWin(int[] nums) {
        int i = 0, n = nums.length, s = 0, d = 0;
        for (i = 0; i < n; i++) {
            if (nums[i] < 10) {
                s += nums[i];
            } else {
                d += nums[i];
            }
        }
        return s != d;
    }
}
