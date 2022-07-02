class Solution {
    public boolean areNumbersAscending(String s) {
        int i=0,m=0;
        String x[]=s.split(" ");
        for(String a:x){
            int n=0,c=0;
            for(i=0;i<a.length();i++){
                if(Character.isDigit(a.charAt(i))){
                    c++;
                    int d=Character.getNumericValue(a.charAt(i));
                    // System.out.println("d: "+d);
                    n= (n*10) + d;
                }
            }
            // System.out.println(n);
            if(c>0){
                if(n>m){
                    m=n;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
