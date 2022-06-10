class Solution {
    public int dominantIndex(int[] nums) {
        int i=0,l=nums.length,m=0,c=0,j=0;
        if(l==1) return 0;
        for(i=0;i<l;i++){
            if(nums[i]>m){
                m=nums[i];
                j=i;
            }
        }
        for(i=0;i<l;i++){
            if(m>=nums[i]*2){
                c++;
            }
        }
        if(c>=l-1){
            return j;
        } else {
            return -1;
        }
    }
}
