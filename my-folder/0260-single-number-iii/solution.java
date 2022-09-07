class Solution {
    public int[] singleNumber(int[] nums) {
        int x[] =new int[2];
        int i=0,j=0,l=nums.length,c=0,n=0;
        if(l==2){
            return nums;
        }
        Arrays.sort(nums);
        for(i=0;i<l-1;i+=2){
            if(nums[i]!=nums[i+1]){
                if(i==0){
                    x[j]=nums[i];
                    j++;
                } else {
                    if(nums[i-1] != nums[i]){
                        x[j]=nums[i];
                        j++;
                    }
                }
                if(i+1 == l-1){
                    x[j]=nums[i+1];
                    j++;
                } else {
                    if(nums[i+1] != nums[i+2]){
                        x[j]=nums[i+1];
                        j++;
                    }
                }
            }
        }
        return x;
    }
}
