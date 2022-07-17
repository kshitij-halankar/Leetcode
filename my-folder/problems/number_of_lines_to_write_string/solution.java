class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int i=0,j=0,l=s.length(),line=100,d=0;
        int k[]=new int[2];
        k[0]=1;
        for(i=0;i<l;i++){
            int c=s.charAt(i)-97;
            int a=d+widths[c];
            if(a>100){
                k[0]++;
                d=widths[c];
            } else{
                d=a;
            }
        }
        k[1]=d;
        return k;
    }
}