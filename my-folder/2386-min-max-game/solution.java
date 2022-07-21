class Solution {
    public int minMaxGame(int[] nums) {
        int i=0,l=nums.length;
        while(l>1){
            int n=l/2;
            int k[]=new int[n];
            int j=0;
            for(i=0;i<n;i++){
                if(i%2==0){
                    k[i]=Math.min(nums[2*i],nums[2*i+1]);
                    // System.out.println("even: "+k[i]);
                }else{
                    k[i]=Math.max(nums[2*i],nums[2*i+1]);
                    // System.out.println("odd: "+k[i]);
                }
                j++;
            }
            l=n;
            nums=k;
        }
        return nums[0];
    }
}
