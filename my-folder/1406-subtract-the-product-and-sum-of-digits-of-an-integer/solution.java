class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
        while(n>0){
            int a=n%10;
            s+=a;
            p*=a;
            n/=10;
        }
        return p-s;
    }
}
