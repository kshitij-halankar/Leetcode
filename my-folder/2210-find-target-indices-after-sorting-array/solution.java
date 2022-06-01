class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int l=nums.length,i=0,j=0;
        List<Integer> k = new ArrayList<>();
        for(i=0;i<l;i++){
            for(j=0;j<=i;j++){
                if(nums[i]<nums[j]){
                    int t=nums[j];
                    nums[j]=nums[i];
                    nums[i]=t;
                }
            }
        }
        for(i=0;i<l;i++){
            if(nums[i]==target){
                k.add(i);
            }
        }
        return k;
    }
}
