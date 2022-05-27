class Solution {
    public int[] minOperations(String boxes) {
        int l=boxes.length();
        int[] a=new int[l];
        char[] k=boxes.toCharArray();
        int m=0,i=0;
        for(i=0;i<l;i++){
            m=boxes.charAt(i)=='1'?m+1:m+0;
        }
        for(i=0;i<l;i++){
            char[] k1=k;
            char[] k2=k;
            int c=0,j=0,h=0;
            for(j=0;j<l;j++){
                if(k1[j]=='1' && i!=j){
                    c+=Math.abs(i-j);
                }
            }
            a[i]=c;
        }
        return a;
    }
}
