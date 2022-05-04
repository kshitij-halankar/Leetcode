class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x = new int[2*n];
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            x[j] = nums[i];
            x[j+1] = nums[n+i];
            j+=2;
        }
        return x;
    }
}
