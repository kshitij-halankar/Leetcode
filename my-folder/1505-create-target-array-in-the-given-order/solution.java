class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int l=index.length;
        int i=0;
        int[] k=new int[l];
        for(i=0;i<l;i++){
            int c=index[i];
            int s=nums[i];
            int j=0;
            for(j=l-1;j>c;j--){
                k[j]=k[j-1];
            }
            k[c]=s;
        }
        return k;
    }
}
