class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int i=0, l=logs.length, d=0, md=logs[0][1], k=logs[0][1], e=logs[0][0];
        for(i=1;i<l;i++){
            int x=logs[i][1];
            d = x-k;
            if(d>md){
                md=d;
                e=logs[i][0];
            } else if(d == md) {
                if(e > logs[i][0]) {
                    e = logs[i][0];
                }
            }
            k=x;
        }
        return e;
    }
}