class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0,l1=nums1.length,l2=nums2.length;
        List<Integer> a=new ArrayList<>();
        for(i=0;i<l1;i++){
            for(j=0;j<l2;j++){
                if(nums1[i]==nums2[j] && !a.contains(nums1[i])){
                    a.add(nums1[i]);
                }
            }
        }
        int l=a.size();
        int k[]=new int[l];
        for(i=0;i<l;i++){
            k[i]=a.get(i);
        }
        return k;
    }
}
