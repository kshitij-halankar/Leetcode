class Solution {
    public int largestAltitude(int[] gain) {
        int l=gain.length;
        int i=0,j=0,c=0;
        for(i=0;i<l;i++){
            j=j+gain[i];
            if(j>c){
                c=j;
            }
        }
        return c;
    }
}
