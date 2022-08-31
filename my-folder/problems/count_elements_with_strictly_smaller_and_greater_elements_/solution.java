class Solution {
    public int countElements(int[] nums) {
        int i=0,j=0,l=nums.length,g=0,s=0,c=0;
        Arrays.sort(nums);
        for(i=1;i<l-1;i++){
            g=0;
            s=0;
            for(j=0;j<l;j++){
                if(i!=j){
                    // System.out.println("i: "+i+" j: "+j);
                    if(nums[i] < nums[j]){
                        s=1;
                        // System.out.println("s i: "+i+" j: "+j);
                    } else if(nums[i] > nums[j]){
                        g=1;
                        // System.out.println("g i: "+i+" j: "+j);
                    }
                }
            }
            if(g>0 && s>0){
                c++;
            }
        }
        return c;
    }
}