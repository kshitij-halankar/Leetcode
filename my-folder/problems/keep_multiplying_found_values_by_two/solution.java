class Solution {
    public int findFinalValue(int[] nums, int original) {
        int l=nums.length,i=0;
        while(i<l){
            if(nums[i]==original){
                original*=2;
                i=0;
            }else{
                i++;
            }
        }
        return original;
    }
}