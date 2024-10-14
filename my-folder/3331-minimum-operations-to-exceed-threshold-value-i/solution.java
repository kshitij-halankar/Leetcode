class Solution {
    public int minOperations(int[] nums, int k) {
        int i = 0, n = nums.length, c = 0;
        // Arrays.sort(nums);
        for (i = 0; i < n; i++) {
            if(nums[i] < k) {
                c++;
            }
        }
        return c;
    }
}
