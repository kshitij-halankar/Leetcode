class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,l=nums.length,mo=0,oc=0;
        for(i=0;i<l;i++){
            if(nums[i]==1){
                oc++;
                if(oc>mo){
                    mo=oc;
                }
            }else{
                oc=0;
            }
        }
        return mo;
    }
}