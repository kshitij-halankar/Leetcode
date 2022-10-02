class Solution {
    public int commonFactors(int a, int b) {
        int i=0, l=0, c=0;
        if(a>b){
            l=b;
        } else {
            l=a;
        }
        for(i=1;i<=l;i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        return c;
    }
}