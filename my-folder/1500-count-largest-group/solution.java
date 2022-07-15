class Solution {
    public int countLargestGroup(int n) {
        int i=0,c=0,m=0;
        int k[]=new int[n+1];
        for(i=1;i<=n;i++){
            int d=0,s=i;
            while(s>0){
                d+=s%10;
                s/=10;
            }
            k[d]++;
            if(k[d]>m){
                m=k[d];
            }
        }
        for(i=0;i<=n;i++){
            if(k[i]==m){
                c++;
            }
        }
        return c;
    }
}
