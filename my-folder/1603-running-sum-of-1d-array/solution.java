class Solution {
    public int[] runningSum(int[] nums) {
        int i = 0, s = 0;
        int l = nums.length;
        int[] a = new int[l];
        for (i = 0; i < l; i++) {
            s += nums[i];
            a[i] = s;
        }
        return a;
    }
}
