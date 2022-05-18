class Solution {
    public int countPairs(int[] nums, int k) {
        int l = nums.length;
        int i = 0, j = 1, c = 0;
        for (i = 0; i < l && i != j; i++) {
            for (j = 1; j < l && j != i; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    c++;
                }
            }
        }
        return c;
    }
}
