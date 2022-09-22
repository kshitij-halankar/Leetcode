class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int i=2, l=n-2;
        for(i=2;i<=l;i++){
            // System.out.println(i+" : "+Integer.toString(n,i));
            long x=Long.parseLong(Integer.toString(n,i));
            long y=x,z=0;
            while(y>0){
                z*=10;
                z+=y%10;
                y/=10;
            }
            if(z!=x){
                return false;
            }
            // String s = Integer.toString(n,i),t="";
            // int j=0,ll=s.length();
            // for(j=ll-1;j>=0;j--){
            //     t+=s.charAt(j);
            // }
            // if(!s.equals(t)){
            //     return false;
            // }
        }
        return true;
    }
}
