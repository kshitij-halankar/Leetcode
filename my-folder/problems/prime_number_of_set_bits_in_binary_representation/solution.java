class Solution {
    public int countPrimeSetBits(int left, int right) {
        int i=0,c=0;
        for(i=left;i<=right;i++){
            String s=Integer.toBinaryString(i);
            int j=0,k=0,l=s.length();
            for(j=0;j<l;j++){
                if(s.charAt(j)=='1')
                    k++;
            }
            if(k>1){
                int b=0;
                for(j=2;j<=k/2;j++){
                    if(k%j==0)
                        b++;
                }
                if(b==0) c++;
            }
        }
        return c;
    }
}