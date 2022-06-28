class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=0,l=nums.length;
        for(i=0;i<l;i++){
            nums[i]=(int)Math.pow(nums[i],2);
        }
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(nums[i]<nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        return nums;
    }
}