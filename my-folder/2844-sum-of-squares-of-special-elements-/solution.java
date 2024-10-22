class Solution {
    public int sumOfSquares(int[] nums) {
        int i = 0, n = nums.length, s = 0;
        for (i = 1; i <= n; i++) {
            s += (n % i == 0) ? Math.pow(nums[i-1],2) : 0;
        }
        return s;
    }
}
