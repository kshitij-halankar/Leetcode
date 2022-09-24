class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,l=nums.length, z=-1,n=-1,x=0;
        while(i<l){
            // System.out.println("i:"+i);
            if(nums[i]==0 && z == -1){
                z=i;
            }
            if(nums[i] != 0){
                n=i;
            }
            if(n>z && z>-1){
                // System.out.println("n:"+n+" z:"+z);
                int t=nums[n];
                nums[n]=nums[z];
                nums[z]=t;
                i=z+1;
                n=-1;
                z=-1;
                // for(j=0;j<l;j++){
                //     System.out.print(nums[j]+" ");
                // }
                // System.out.println();
            } else {
                i++;
            }
        }
    }
}