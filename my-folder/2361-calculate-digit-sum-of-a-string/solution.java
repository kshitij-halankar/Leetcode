class Solution {
    public String digitSum(String s, int k) {
        int i=0;
        while(s.length()>k){
            int l=s.length();
            int a=l/k;
            int b=l%k;
            int c=0;
            if(b>0){
                c=a+1;
            } else {
                c=a;
            }
            // System.out.println("a: "+a+" b: "+b+" c: "+c);
            int j=0;
            String v="";
            for(i=1;i<=c;i++){
                String x="";
                if(i==c && b>0){
                    x=s.substring(j,j+b);
                    // System.out.println("j:"+j+" b:"+b);
                }else{
                    x=s.substring(j,j+k);
                    // System.out.println("j:"+j+" else:"+b);
                }
                int m=0,n=0;
                for(m=0;m<x.length();m++){
                    n+=Character.getNumericValue(x.charAt(m));
                }
                v+=""+n;
                j+=k;
                // System.out.println(x);
            }
            s=v;
            // System.out.println("s:"+s);
        }
        return s;
    }
}
