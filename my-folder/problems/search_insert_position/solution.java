class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,n=nums.length;
        while(i <n && nums[i] <= target) {
            if(nums[i]==target){
                return i;
            }
            i++;
        }
        return i;
    }
}