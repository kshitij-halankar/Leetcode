class Solution {
    public int divisorSubstrings(int num, int k) {
        String a=""+num;
        int i=0,j=0,c=0,l=a.length();
            // System.out.println(a);
        for(i=0;i<l-k+1;i++){
            String b="";
            for(j=i;j<k+i;j++){
                b+=""+a.charAt(j);
            }
            // System.out.println(b);
            int d=Integer.parseInt(b);
            if(d>0 && num%d==0){
                c++;
            }
        }
        return c;
    }
}
