class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0,l=nums.length,c=0,n=0,x=0;
        for(i=0;i<l-2;i+=3){
            if(nums[i] != nums[i+1]){
                if(nums[i+1] == nums[i+2]){
                    return nums[i];
                } else if(nums[i] == nums[i+2]){
                    return nums[i+1];
                }
            }
            if(nums[i+1] != nums[i+2]){
                return nums[i+2];
            }
        }
        return nums[l-1];
    }
}
