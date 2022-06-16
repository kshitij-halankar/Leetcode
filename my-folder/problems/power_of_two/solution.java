class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0,l=(int)Math.sqrt(n)+1;
        // System.out.println(i);
        while(i<=l){
            if(Math.pow(2,i)==n)
                return true;
            i++;
        }
        // return (Math.sqrt(n)%1==0);
        return false;
    }
}