class Solution {
    public int[] plusOne(int[] digits) {
        int i=0,l=digits.length, d=1,c=0;
        int x[];
        if(digits[l-1]==9){
            // l++;
            x=new int[l];
            for(i=l-1;i>=0;i--){
                // System.out.println("i:"+i+" d:"+d+" c:"+c+" digits[i]:"+digits[i]);
                c=digits[i]+d;
                if(c>9){
                    x[i]=0;
                    d=1;
                } else {
                    x[i]=c;
                    d=0;
                }
            }
            if(d!=0){
                int y[]=new int[l+1];
                y[0]=d;
                for(i=0;i<l;i++){
                    y[i+1]=x[i];
                }
                return y;
            }
            return x;
        } else {
            x=new int[l];
            x[l-1]=digits[l-1]+1;
            for(i=0;i<l-1;i++){
                x[i]=digits[i];
            }
            return x;
        }
    }
}