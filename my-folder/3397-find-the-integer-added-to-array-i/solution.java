class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int i = 0, n = nums1.length, s1 = 0, s2 = 0;
        for (i = 0; i < n; i++) {
            s1 += nums1[i];
            s2 += nums2[i];
        }
        return (s2 - s1) / n;
    }
}
