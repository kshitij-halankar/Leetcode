class Solution {
    public int findDuplicate(int[] nums) {
        int i=0,j=0,l=nums.length;
        int x[] = new int[l+1];
        for(i=0;i<l;i++){
            x[nums[i]]++;
            if(x[nums[i]]>1){
                return nums[i];
            }
        }
        return nums[l-1];
    }
}
