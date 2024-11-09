class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int i = 0, j = 0, n = nums.length, m = 0, p = 0;
        for (i = 0; i < k; i++) {
            m = Integer.MAX_VALUE;
            for (j = 0; j < n; j++) {
                if (nums[j] < m) {
                    m = nums[j];
                    p = j;
                }
            }
            nums[p] = m * multiplier;
        }
        return nums;
    }
}
