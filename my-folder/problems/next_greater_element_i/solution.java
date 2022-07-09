class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0,l1=nums1.length,l2=nums2.length;
        int a[]=new int[l1];
        for(i=0;i<l1;i++){
            int c=-1;
            for(j=0;j<l2;j++){
                if(nums1[i] == nums2[j]){
                    for(k=j;k<l2;k++){
                        if(nums2[k]>nums2[j]){
                            c=nums2[k];
                            break;
                        }
                    }
                }
            }
            a[i]=c;
        }
        return a;
    }
}