class Solution {
    public int[] numberGame(int[] nums) {
        int i = 0, n = nums.length;
        int[] a = new int[n];
        Arrays.sort(nums);
        for (i = 0; i < n - 1; i += 2) {
            a[i] = nums[i+1];
            a[i+1] = nums[i];
        }
        return a;
    }
}
