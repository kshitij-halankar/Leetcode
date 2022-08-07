class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a[]=new int[2];
        int i=0,j=0,l1=aliceSizes.length,l2=bobSizes.length,x1=0,x2=0;
        for(i=0;i<l1;i++){
            x1+=aliceSizes[i];
        }
        for(i=0;i<l2;i++){
            x2+=bobSizes[i];
        }
        for(i=0;i<l1;i++){
            int d1=0,d2=0;
            for(j=0;j<l2;j++){
                d1 = x1 - aliceSizes[i] + bobSizes[j];
                d2 = x2 - bobSizes[j] + aliceSizes[i];
                // System.out.println("x1: "+x1+" x2: "+x2+" d1: "+d1+" d2: "+d2);
                if(d1 == d2){
                    a[0] = aliceSizes[i];
                    a[1] = bobSizes[j];
                    break;
                }
            }
            if(d1==d2){
                break;
            }
        }
        return a;
    }
}
