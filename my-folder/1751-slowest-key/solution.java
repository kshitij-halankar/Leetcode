class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int i=0,l=releaseTimes.length,m=releaseTimes[0];
        char c=keysPressed.charAt(0);
        for(i=1;i<l;i++){
            int a=releaseTimes[i]-releaseTimes[i-1];
            if(a>m){
                m=a;
                c=keysPressed.charAt(i);
            } else if(a==m){
                if(c<keysPressed.charAt(i)){
                    c=keysPressed.charAt(i);
                }
            }
        }
        return c;
    }
}
