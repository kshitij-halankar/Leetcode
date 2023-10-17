class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, n=nums.length-1,t=n,k=0;
        for(i=n;i>=0;i--){
            if(nums[i]==val){
                int p=nums[t];
                nums[t]=nums[i];
                nums[i]=p;
                t--;
            } else {
                k++;
            }
        }
        return k;
    }
}