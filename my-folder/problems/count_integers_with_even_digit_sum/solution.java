class Solution {
    public int countEven(int num) {
        int i=0,c=0;
        for(i=2;i<=num;i++){
            int s=0,n=i;
            while(n>0){
                s+=n%10;
                n/=10;
            }
            if(s%2==0){
                c++;
            }
        }
        return c;
    }
}