class Solution {
    public int findGCD(int[] nums) {
        int i=0,l=nums.length,m=0,n=Integer.MAX_VALUE,g=0;
        for(i=0;i<l;i++){
            if(nums[i]>m){
                m=nums[i];
            }
            if(nums[i]<n){
                n=nums[i];
            }
        }
        if(m%n==0){
            return n;
        } else{
            for(i=n-1;i>0;i--){
                if(m%i ==0 && n%i ==0){
                    return i;
                }
            }
        }
        return g;
    }
}
