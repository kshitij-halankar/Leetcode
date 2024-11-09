class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int i = 0, j = 0, m = nums1.length, n = nums2.length;
        int[] a = new int[2];
        while (i < m) {
            for (j = 0; j < n; j++) {
                if(nums1[i] == nums2[j]) {
                    a[0]++;
                    break;
                }
            }
            i++;
        }
        i = 0;
        while (i < n) {
            for (j = 0; j < m; j++) {
                if (nums2[i] == nums1[j]) {
                    a[1]++;
                    break;
                }
            }
            i++;
        }
        return a;
    }
}
