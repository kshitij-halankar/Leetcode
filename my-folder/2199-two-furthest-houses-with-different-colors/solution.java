class Solution {
    public int maxDistance(int[] colors) {
        int i=0,j=0,m=0,l=colors.length,d=0;
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                int c=Math.abs(colors[i]-colors[j]);
                if(c!=0){
                    d=Math.abs(i-j);
                    if(d>m){
                        m=d;
                    }
                }
            }
        }
        return m;
    }
}
