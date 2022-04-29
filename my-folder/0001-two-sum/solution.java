class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int i = 0, j = 0;
        int[] ans = new int[2];
        for (i=0; i<len; i++) {
            for (j=0; j<len; j++) {
                if(i != j) {
                    if((nums[i] + nums[j]) == target) {
                        ans[0] = i;
                        ans[1] = j;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
