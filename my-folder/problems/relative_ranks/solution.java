class Solution {
    public String[] findRelativeRanks(int[] score) {
        int i=0,j=0,r=1,l=score.length;
        // int a[] = new int[l];
        int b[] = new int[l];
        String x[] = new String[l];
        for(i=0;i<l;i++){
            b[i]=score[i];
        }
        Arrays.sort(score);
        i=l-1;
        while(i>=0){
            // System.out.println("i: "+i);
            for(j=0;j<l;j++){
                if(score[i] == b[j]){
                    // System.out.println("r:"+r);
                    if(r==1){
                        x[j]="Gold Medal";
                    } else if(r==2){
                        x[j]="Silver Medal";
                    } else if(r==3){
                        x[j]="Bronze Medal";
                    } else {
                        x[j]=""+r;
                    }
                    // a[j]=r;
                    r++;
                    break;
                }
            }
            i--;
        }
        return x;
    }
}