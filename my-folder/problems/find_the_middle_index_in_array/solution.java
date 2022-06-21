class Solution {
    public int findMiddleIndex(int[] nums) {
        int i=0,j=0,l=nums.length,sl=0,sr=0;
        for(i=0;i<l;i++){
            sl=0;
            sr=0;
            for(j=0;j<i;j++){
                sl+=nums[j];
            }
            for(j=i+1;j<l;j++){
                sr+=nums[j];
            }
            if(sl==sr)
                return i;
        }
        return -1;
    }
}