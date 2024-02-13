class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0, n=s.length(), t=0;
        char c[] = new char[n];
        for(i=0;i<n;i++){
            char ch = s.charAt(i);
            if((ch > 96 && ch < 123 ) || (ch > 47 && ch < 58)){
                c[t] = ch;
                t++;
            }
        }
        n=t-1;
        for(i=0; i<t/2; i++){
            if(c[i] != c[n]){
                return false;
            }
            n--;
        }
        return true;
    }
}
