class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l = nums.length;
        int i = 0, j = 0;
        int k[] = new int[l];
        for(i = 0;i < l; i++) {
            k[i] = 0;
            for(j = 0; j < l; j++) {
                if (i != j && nums[i] > nums[j]) {
                    k[i]++;
                }
            }
        }
        return k;
    }
}
