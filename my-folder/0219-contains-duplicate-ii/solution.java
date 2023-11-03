class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0, n=nums.length;
        while(k>0){
            for(i=0; i<n-k; i++){
                if(nums[i] == nums[i+k]){
                    return true;
                }
            }
            k--;
        }
        return false;
    }
}
