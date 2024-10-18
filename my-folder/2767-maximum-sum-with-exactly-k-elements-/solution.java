class Solution {
    public int maximizeSum(int[] nums, int k) {
        int i = 0, n = nums.length, m = 0, s = 0;
        for (i = 0; i < n; i++) {
            m = Math.max(m, nums[i]);
        }
        for (i = 0; i < k; i++) {
            s += i + m;
        }
        return s;
        // return (((m+k)*(m+k-1)/2) - (m*(m-1)/2));
    }
}
