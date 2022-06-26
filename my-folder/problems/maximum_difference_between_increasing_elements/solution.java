class Solution {
    public int maximumDifference(int[] nums) {
        int i=0,j=0,l=nums.length,m=-1;
        for(i=0;i<l-1;i++){
            for(j=i+1;j<l;j++){
                if(i!=j && nums[i] < nums[j]){
                    int c=nums[j]-nums[i];
                    // System.out.println("i: " +nums[i] + " j: " + nums[j] + " m: "+m + " c: "+c);
                    if(c>m){
                        m=c;
                    }
                }
            }
        }
        return m;
    }
}