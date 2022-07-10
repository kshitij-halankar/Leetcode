class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int i=0, j=0, l1=nums1.length, l2=nums2.length;
        List<Integer> k1=new ArrayList<>();
        List<Integer> k2=new ArrayList<>();
        for(i=0;i<l1;i++){
            int c=0;
            for(j=0;j<l2;j++){
                if(nums1[i]==nums2[j]){
                    c++;
                    break;
                }
            }
            if(c==0){
                if(!k1.contains(nums1[i])){
                    k1.add(nums1[i]);
                }
            }
        }
        for(i=0;i<l2;i++){
            int c=0;
            for(j=0;j<l1;j++){
                // System.out.println(nums2[i]+" "+nums1[j]);
                if(nums2[i]==nums1[j]){
                    c++;
                    break;
                }
            }
            if(c==0){
                if(!k2.contains(nums2[i])){
                    k2.add(nums2[i]);
                }
            }
        }
        List<List<Integer>> k=new ArrayList<>();
        k.add(k1);
        k.add(k2);
        return k;
    }
}