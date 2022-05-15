class Solution {
    public int countKDifference(int[] nums, int k) {
        int c = 0, i = 0, j = 0;
        int l = nums.length;
        for (i = 0; i < l; i++){
            for(j = 0; j < l && j != i; j++) {
                int a = nums[i] - nums[j];
                if (a == k || a*-1 == k) {
                    c++;
                }
            }
        }
        return c;
    }
}