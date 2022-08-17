class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int i=0,l=s.length(),d=0,m=0;
        char c = '0';
        for(i=0;i<l;i++){
            // if(c == '0') {
            //     c = s.charAt(i);
            // }
            // if(c == '1') {
                char x = s.charAt(i);
                if(x == '1'){
                    if(d>m){
                        m=d;
                    }
                    d=0;
                }
                d++;
                c=s.charAt(i);
            // }
        }
        return m;
    }
}
