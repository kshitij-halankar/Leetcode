class Solution {
    public int[] decrypt(int[] code, int k) {
        int i=0, j=0, h=0, l=code.length, c=0;
        int x[]=new int[l];
        while(i<l){
            if(k>0){
                j=0;
                c=0;
                h=i+1; 
                while(j<k){
                    if(h>l-1){
                        h=0;
                    }
                    // System.out.println("h: "+h);
                    c+=code[h];
                    h++;
                    j++;
                }
            } else if(k<0){
                j=0;
                c=0;
                h=i-1; 
                while(j>k){
                    if(h<0){
                        h=l-1;
                    }
                    // System.out.println("h: "+h);
                    c+=code[h];
                    h--;
                    j--;
                }
            }
            x[i]=c;
            i++;
        }
        return x;
    }
}
