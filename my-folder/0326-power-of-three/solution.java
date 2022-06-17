class Solution {
    public boolean isPowerOfThree(int n) {
        int i=0,l=(int)Math.pow(n,0.333)+1;
        // System.out.println(Math.pow(25,0.33));
        while(i<=l){
            if(Math.pow(3,i)==n)
                return true;
            i++;
        }
        return false;
    }
}
