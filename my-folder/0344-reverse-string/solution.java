class Solution {
    public void reverseString(char[] s) {
        int i=0,l=s.length;
        for(i=0;i<l/2;i++){
            char c = s[i];
            s[i]=s[l-i-1];
            s[l-i-1]=c;
        }
    }
}
