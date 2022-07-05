class Solution {
    public boolean isThree(int n) {
        int i=2,c=2;
        for(i=2;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        return c==3;
    }
}
