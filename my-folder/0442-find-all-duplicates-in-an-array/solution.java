class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> x=new ArrayList<>();
        int i=0,l=nums.length,c=1;
        Arrays.sort(nums);
        for(i=1;i<l;i++){
            if(nums[i-1]==nums[i]){
                x.add(nums[i]);
            }
        }
        return x;
    }
}
