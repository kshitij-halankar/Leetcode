class Solution {
    public int minimumOperations(int[] nums) {
        int i = 0, n = nums.length, s = 0;
        for (i = 0; i < n; i++) {
            if (nums[i] % 3 != 0) {
                s++;
            }
        }
        return s;
    }
}
