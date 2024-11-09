class Solution {
    public int minOperations(int[] nums) {
        int m = 0, c = 0;
        for (int n : nums) {
            if (n > m) {
                m = n;
            } else {
                c += (++m) - n;
            }
        }
        return c;
    }
}
