class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int i = 0, p1 = 0, p2 = 0, n = nums.length, c = 0;
        for (i = 0; i < n-2; i++) {
            p1 = i + 1;
            p2 = i + 2;
            while (p1 < n-1 && nums[p1] - nums[i] <= diff) {
                if (nums[p1] - nums[i] == diff) {
                    while (p2 < n && nums[p2] - nums[p1] <= diff) {
                        if (nums[p2] - nums[p1] == diff) {
                            c++;
                        }
                        p2++;
                    }
                }
                p1++;
                p2++;
            }
        }
        return c;
    }
}
