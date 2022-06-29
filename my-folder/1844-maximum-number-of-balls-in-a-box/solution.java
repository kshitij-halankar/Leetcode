class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int i=0,c=0;
        // int n=highlimit-lowlimit+1;
        int b[]=new int[highLimit+1];
        for(i=lowLimit;i<=highLimit;i++){
            int a=0,d=i;
            while(d>0){
                // System.out.println("i: "+d+" a: "+a);
                a=a+(d%10);
                d=d/10;
            }
            b[a]++;
                // System.out.println("b["+a+"]: "+b[a]);
        }
        for(i=0;i<=highLimit;i++){
            if(b[i]>c){
                c=b[i];
            }
        }
        return c;
    }
}
