class Solution {
    public int[] separateDigits(int[] nums) {
        int i = 0, n = nums.length, c = 0, s = 0;
        for (i = 0; i < n; i++) {
            c = nums[i];
            while (c > 0) {
                s++;
                c /= 10;
            }
        }
        int[] d = new int[s];
        for (i = n-1; i >= 0; i--) {
            while (nums[i] > 0) {
                d[--s] = nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
        }
        return d;
    }
}
