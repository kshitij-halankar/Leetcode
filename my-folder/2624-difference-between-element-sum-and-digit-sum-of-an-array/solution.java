class Solution {
    public int differenceOfSum(int[] nums) {
        int i = 0, n = nums.length, e = 0, d = 0;
        for (i = 0; i < n; i++) {
            e += nums[i];
            while(nums[i] > 0) {
                d += nums[i] % 10;
                nums[i] /= 10;
            }
        }
        return Math.abs(e - d);
    }
}
