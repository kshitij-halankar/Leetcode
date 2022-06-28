class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,l=m+n;
        for(i=m;i<l;i++){
            nums1[i]=nums2[j];
            j++;
        }
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(nums1[i]<nums1[j]){
                    int t=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=t;
                }
            }
        }
    }
}