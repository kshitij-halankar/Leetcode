class Solution {
    public int[] leftRightDifference(int[] nums) {
        int i = 0, j = 0, k = 0, n = nums.length;
        int[] ans = new int[n], l = new int[n], r = new int[n];
        l[0] = r[n-1] = 0;
        for (i = 0, j = n-1; i < n-1; i++, j--) {
            l[i+1] = l[i] + nums[i];
            r[j-1] = r[j] + nums [j];
        }
        for (i = 0; i < n; i++) {
            ans[i] = Math.abs(l[i] - r[i]);
        }
        return ans;
    }
}
