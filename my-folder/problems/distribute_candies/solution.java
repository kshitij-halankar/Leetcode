class Solution {
    public int distributeCandies(int[] candyType) {
        int i=0,j=0,c=0,l=candyType.length;
        boolean u=false;
        for(i=0;i<l;i++){
            u=true;
            for(j=0;j<i;j++){
                if(candyType[i] == candyType[j]){
                    u=false;
                    break;
                }
            }
            if(u){
                c++;
            }
            
            if(c == l/2){
                break;
            }
        }
        return c;
    }
}