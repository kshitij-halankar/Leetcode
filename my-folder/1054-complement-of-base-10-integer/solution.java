class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n),x="";
        int i=0,l=s.length();
        for(i=0;i<l;i++){
            if(s.charAt(i)=='0'){
                x+='1';
            } else{
                x+='0';
            }
        }
        return Integer.parseInt(x,2);
    }
    //  public int bitwiseComplement(int n) {
    //     int c=0,i=0;
    //     for(i=0;i<n;i++){
    //         c+=Math.pow(2,i);
    //         if(c>=n)
    //             break;
    //     }
    //     return c-n;
    // }
}
