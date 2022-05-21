class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int c=0,i=0,m=0;
        int l=rectangles.length;
        int g[]=new int[l];
        for(i=0;i<l;i++){
            if(rectangles[i][0]>rectangles[i][1]){
                g[i]=rectangles[i][1];
            }else{
                g[i]=rectangles[i][0];
            }
            if(g[i]>m){
                m=g[i];
            }
        }
        for(i=0;i<l;i++){
            if(g[i]==m){
                c++;
            }
        }
        return c;
    }
}
