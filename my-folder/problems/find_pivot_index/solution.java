class Solution {
    public int pivotIndex(int[] nums) {
        int i=0,l=nums.length,j=0,c=-1,sl=0,sr=0;
        for(i=0;i<l;i++){
            sl=0;
            sr=0;
            for(j=0;j<i;j++){
                sl+=nums[j];
            }
            for(j=l-1;j>i;j--){
                sr+=nums[j];
            }
            if(sl==sr){
                c=i;
                return c;
            }
        }
        return c;
    }
}