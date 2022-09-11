class Solution {
    public int mostFrequentEven(int[] nums) {
        int i=0,l=nums.length,c=0,d=-1,mc=0,md=-1;
        Arrays.sort(nums);
        for(i=0;i<l;i++){
            if(nums[i]%2==0){
                if(d<0){
                    d=nums[i];
                    c++;
                } else if(d == nums[i]){
                    c++;
                } else {
                    c=1;
                    d=nums[i];
                }
                if(c>mc){
                    mc=c;
                    md=d;
                }
            }
        }
        return md;
    }
}
