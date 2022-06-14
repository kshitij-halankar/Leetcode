class Solution {
    public int[] countBits(int n) {
        int i=0,j=0;
        int[] ans=new int[n+1];
        for(i=0;i<=n;i++){
            String s=Integer.toBinaryString(i);
            // System.out.println(s);
            int l=s.length(),c=0;
            for(j=0;j<l;j++){
                if(s.charAt(j)=='1')
                    c++;
            }
            ans[i]=c;
        }
        return ans;
    }
}
