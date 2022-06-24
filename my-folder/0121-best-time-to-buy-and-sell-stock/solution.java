class Solution {
    public int maxProfit(int[] prices) {
        int i=0,j=Integer.MAX_VALUE,p=0,m=0,l=prices.length;
        for(i=0;i<l;i++){
            if(prices[i]<j){
                j=prices[i];
            }
            p=prices[i]-j;
            if(p>m){
                m=p;
            }
        }
        return m;
    }
}
