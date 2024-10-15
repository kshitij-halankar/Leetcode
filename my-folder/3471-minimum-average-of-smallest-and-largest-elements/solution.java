class Solution {
    public double minimumAverage(int[] nums) {
        int i = 0, n = nums.length;
        double[] a = new double[n/2];
        Arrays.sort(nums);
        for (i = 0; i < n/2; i++) {
            a[i] = (nums[i] + nums[n-1-i]) / 2.0;
        }
        Arrays.sort(a);
        return a[0];
    }
}
