class Solution {
    public int[] decompressRLElist(int[] nums) {
        int i = 0, j = 0, f = 0, v = 0, n = 0, m = 0;
        int l = nums.length;
        List<Integer> a = new ArrayList<>();
        for(i = 0; i < l-1; i += 2) {
            f = 0;
            v = 0;
            f = nums[2*m];
            v = nums[2*m + 1];
            for (j = 0; j < f; j++) {
                a.add(v);
                n++;
            }
            m++;
        }
        int z[] = new int[n];
        for (i = 0; i < n; i++) {
            z[i] = a.get(i);
        }
        return z;
    }
}