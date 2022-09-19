class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0,j=1,c=0,l=nums.length;
        Arrays.sort(nums);
        while(i<l){
            if(nums[i]>0){
                // System.out.println("i: "+i+" j: "+j);
                if(nums[i]==j){
                    j++;
                } else if(nums[i]>j){
                    return j;
                }
            }
            i++;
        }
        if(j<l){
            return j;
        }
        if(nums[l-1]==l){
            return l+1;
        }
        return l;
    }
}
