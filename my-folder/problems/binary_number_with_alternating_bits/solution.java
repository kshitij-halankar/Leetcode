class Solution {
    public boolean hasAlternatingBits(int n) {
        // int i=5,j=0;
        // if(n<=2)
        //     return true;
        // while(i<=n){
        //     if(i==n)
        //         return true;
        //     if(j%2==0){
        //         i*=2;
        //     } else {
        //         i=(i*2)+1;
        //     }
        //     j++;
        // }
        // return false;
        String x=Integer.toBinaryString(n);
        int i=0,l=x.length();
        for(i=0;i<l-1;i++){
            if(x.charAt(i)==x.charAt(i+1))
                return false;
        }
        return true;
    }
}