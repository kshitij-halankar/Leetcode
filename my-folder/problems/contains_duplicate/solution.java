class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=0,l=nums.length;
        Arrays.sort(nums);
        for(i=1;i<l;i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}