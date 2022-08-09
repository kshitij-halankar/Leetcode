class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=0,l=nums.length,m=nums[l-1],n=0,c=0;
        // System.out.println("m: "+m);
        while(m>0){
            for(i=j;i<l;i++){
                j++;
                if(nums[i]!=0){
                    n=nums[i];
                    break;
                }
            }
            // System.out.println("n: "+n);
            if(j==0){
                j=1;
            }
            for(i=j-1;i<l;i++){
                nums[i]-=n;
                // System.out.println(i+": "+nums[i]);
            }
            m=nums[l-1];
            // j=0;
            c++;
        }
        return c;
    }
}