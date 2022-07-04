class Solution {
    public int smallestEqual(int[] nums) {
        int i=0,l=nums.length;
        for(i=0;i<l;i++){
            if(i%10==nums[i]){
                return i;
            }
        }
        return -1;
    }
}