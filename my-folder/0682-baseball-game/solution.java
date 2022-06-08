class Solution {
    public int calPoints(String[] ops) {
        int i=0,j=0,s=0,l=ops.length;
        int x[]=new int[l];
        for(i=0;i<l;i++){
            switch(ops[i]){
                case "D":
                    x[j]=x[j-1]*2;
                    break;
                case "C":
                    x[j-1]=0;
                    j-=2;
                    break;
                case "+":
                    x[j]=x[j-1]+x[j-2];
                    break;
                default:
                    x[j]=Integer.parseInt(ops[i]);
                    break;
            }
            j++;
        }
        for(i=0;i<l;i++){
            // System.out.println(x[i]);
            s+=x[i];
        }
        return s;
    }
}
