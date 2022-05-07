class Solution {
    public int numIdenticalPairs(int[] nums) {
        int l = nums.length;
        int i = 0, j = 0, a = 0;
        for(i = 0; i < l; i++) {
            for(j = 1; j < l; j++) {
                if(i < j && nums[i] == nums[j]) {
                    a++;
                }
            }
        }
        return a;
    }
}
