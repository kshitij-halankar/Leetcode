class Solution {
    public int subsetXORSum(int[] nums) {
        int i = 0, n = nums.length, bitSize = 1 << n, c = 0;

        for (i = 0; i < bitSize; i++) {
            int curr = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    curr ^= nums[j];
                }
            }
            c += curr;
        }
        return c;
    }
}
