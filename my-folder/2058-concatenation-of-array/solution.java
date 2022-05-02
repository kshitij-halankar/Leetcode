class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int len2 = len * 2;
        int i = 0, j = len;
        int[] a = new int[len2];
        for (i = 0; i < len; i++) {
            a[i] = nums[i];
            a[j] = nums[i];
            j++;
        }
        return a;
    }
}
