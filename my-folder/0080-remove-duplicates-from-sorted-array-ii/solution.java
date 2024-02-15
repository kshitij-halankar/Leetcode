class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0, k=0, n=nums.length, x=n;
        while(i < n-2){
            // System.out.println(nums[i]+" | "+ nums[i+2]);
            if(nums[i]==nums[i+2]){
                for(k=i;k<n-1;k++){
                    nums[k]=nums[k+1];
                }
                i--;
                n--;
            }
            i++;
            // System.out.println(nums);
        }
        return n;
    }
}
