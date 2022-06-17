class Solution {
    public boolean isPowerOfFour(int n) {
        int i=0,l=(int)Math.pow(n,0.25)+1;
        while(i<=l){
            if(Math.pow(4,i)==n)
                return true;
            i++;
        }
        return false;
    }
}
