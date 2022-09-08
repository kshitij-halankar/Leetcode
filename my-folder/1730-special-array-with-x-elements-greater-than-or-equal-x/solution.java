class Solution {
    public int specialArray(int[] nums) {
        int i=0,l=nums.length,j=0;
        for(i=0;i<=l;i++){
            int c=0;
            for(j=0;j<l;j++){
                if(nums[j]>=i){
                    c++;
                }
            }
            if(c==i){
                return c;
            }
        }
        return -1;
    }
}
