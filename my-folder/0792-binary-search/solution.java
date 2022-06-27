class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1,m=0;
        if(h==0){
            if(target==nums[h]){
                return h;
            }
        }
        while(l<=h){
            // m=l+((h-l)/2);
            m=(l+h)/2;
            // System.out.println("l: "+l+" m: "+m +" h: "+h);
            if(target == nums[m]){
                return m;
            } else if(target > nums[m]){
                l=m+1;
            } else {
                h=m-1;
            }
        }
        return -1;
    }
}
