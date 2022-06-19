class Solution {
    public int missingNumber(int[] nums) {
        int i=0,j=0,l=nums.length;
        a:
        while(j<=l){
            for(i=0;i<l;i++){
                if(nums[i]==j){
                    j++;
                    continue a;
                }
                // System.out.println("i: "+i+" j: "+j);
                if(i==l-1){
                    return j;
                }
            }
        }
        return i;
    }
}
