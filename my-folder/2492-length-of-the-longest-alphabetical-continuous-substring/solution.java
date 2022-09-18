class Solution {
    public int longestContinuousSubstring(String s) {
        int i=0,j=0,l=s.length(),c=1,mc=1;
        for(i=0;i<l-1;i++){
            // int a = s.charAt(i);
            // int b = s.charAt(i+1);
            // System.out.println(a + ":"+b);
            if(s.charAt(i)+1 == s.charAt(i+1)){
                c++;
            } else {
                // System.out.println(s.charAt(i));
                c=1;
            }
            if(c>mc){
                mc=c;
            }
        }
        return mc;
    }
}
