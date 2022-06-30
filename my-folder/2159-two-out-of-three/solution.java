class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int i=0,j=0,l1=nums1.length,l2=nums2.length,l3=nums3.length;
        List<Integer> a=new ArrayList<>();
        for(i=0;i<l1;i++){
            for(j=0;j<l2;j++){
                if(nums1[i]==nums2[j]){
                    if(!a.contains(nums1[i])){
                        a.add(nums1[i]);
                    }
                }
            }
        }
        for(i=0;i<l1;i++){
            for(j=0;j<l3;j++){
                if(nums1[i]==nums3[j]){
                    if(!a.contains(nums1[i])){
                        a.add(nums1[i]);
                    }
                }
            }
        }
        for(i=0;i<l2;i++){
            for(j=0;j<l3;j++){
                if(nums2[i]==nums3[j]){
                    if(!a.contains(nums2[i])){
                        a.add(nums2[i]);
                    }
                }
            }
        }
        return a;
    }
}
