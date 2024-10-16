class Solution {
    public int minElement(int[] nums) {
        int i = 0, n = nums.length, c = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) {
            int d = 0;
            while (nums[i] > 0) {
                d += nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
            if(d < c) {
                c = d;
            }
        }
        return c;
    }
}
