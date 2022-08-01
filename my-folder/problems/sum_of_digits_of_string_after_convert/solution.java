class Solution {
    public int getLucky(String s, int k) {
        int i=0,j=0,l=s.length(),c=0,d=0;
        String a="";
        for(i=0;i<l;i++){
            a+=""+(Character.getNumericValue(s.charAt(i))-9);
        }
            // System.out.println(a);
        int l2=a.length();
        for(j=0;j<k;j++){
            c=0;
            for(i=0;i<l2;i++){
                c+=Character.getNumericValue(a.charAt(i));
            }
            d=c;
            a=""+d;
            l2=a.length();
        }
        return d;
    }
}