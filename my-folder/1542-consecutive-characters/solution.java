class Solution {
    public int maxPower(String s) {
        int i=0,l=s.length(),c=1,m=c;
        char a=s.charAt(0);
        for(i=1;i<l;i++){
            if(s.charAt(i)==a){
                c++;
                if(c>m){
                    m=c;
                }
            }else{
                c=1;
                a=s.charAt(i);
            }
        }
        return m;
    }
}
