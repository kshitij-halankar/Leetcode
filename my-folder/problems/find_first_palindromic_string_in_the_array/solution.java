class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            int i=0,k=0;
            char[] c=s.toCharArray();
            int l = c.length;
            for(i=0;i<l/2;i++){
                if(c[i]==c[l-i-1]){
                    k++;
                    continue;
                } else {
                    break;
                }
            }
            if(k==l/2){
                return s;
            }
        }
        return "";
    }
}