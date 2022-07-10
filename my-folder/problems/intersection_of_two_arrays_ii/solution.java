class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0, j=0, l1=nums1.length, l2=nums2.length;
        List<Integer> k=new ArrayList<>();
        for(i=0;i<l1;i++){
            for(j=0;j<l2;j++){
                if(nums1[i]==nums2[j]){
                    k.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int l=k.size();
        int a[]=new int[l];
        for(i=0;i<l;i++){
            a[i]=k.get(i);
        }
        return a;
    }
}