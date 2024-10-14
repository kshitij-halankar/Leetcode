class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int i = 0, j = 0, k = 0, n = nums.length;
        HashSet<Integer> l = new HashSet<>(), r = new HashSet<>();
        int[] diff = new int[n];
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                l.add(nums[j]);
            }
            for (k = i+1; k <= n-1; k++) {
                r.add(nums[k]);
            }
            diff[i] = l.size() - r.size();
            l.clear();
            r.clear();
        }
        return diff;
    }
}
