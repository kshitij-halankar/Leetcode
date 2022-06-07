class Solution {
    public int heightChecker(int[] heights) {
        int i=0,j=0,l=heights.length,c=0;
        int[] k =new int[l];
        for(i=0;i<l;i++){
            k[i]=heights[i];
        }
        for(i=0;i<l;i++){
            for(j=i;j<l;j++){
                if(k[i]>k[j]){
                    int t=k[i];
                    k[i]=k[j];
                    k[j]=t;
                }
            }
        }
        for(i=0;i<l;i++){
            if(heights[i]!=k[i]){
                c++;
            }
        }
        return c;
    }
}