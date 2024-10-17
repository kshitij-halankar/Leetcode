class Solution {
    public int maxProduct(int[] nums) {
        int i = 0, l = 0, s = 0, n = nums.length;
        for (i = 0; i < n; i++) {
            if (nums[i] >= s) {
                if (nums[i] >= l) {
                    s = l;
                    l = nums[i];
                } else {
                    s = nums[i];
                }
            }
        }
        return (l - 1) * (s - 1);
    }
}
