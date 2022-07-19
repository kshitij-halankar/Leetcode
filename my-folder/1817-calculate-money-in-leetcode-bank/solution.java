class Solution {
    public int totalMoney(int n) {
        int i=0,s=0,w=1,d=1;
        for(i=1;i<=n;i++){
            s+=d;
            d++;
            if(i%7 == 0){
                w++;
                d=w;
            }
            // System.out.println("day: "+i+" bal: "+s);
        }
        return s;
    }
}
