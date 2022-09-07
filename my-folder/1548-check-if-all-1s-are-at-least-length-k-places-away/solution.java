class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i=0,l=nums.length,c=-1;
        for(i=0;i<l;i++){
            if(nums[i]==1){
                if(c == -1){
                    c=0;
                } else {
                    if(c<k){
                        return false;
                    } else {
                        c=0;
                    }
                }
            }else{
                if(c != -1){
                    c++;
                }
            }
        }
        return true;
    }
}
