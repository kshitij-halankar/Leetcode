class Solution {
    public int countAsterisks(String s) {
        int i=0, l=s.length(), c=0;
        boolean x=false;
        for(i=0;i<l;i++){
            if(s.charAt(i) == '|'){
                x= !x;
            } else if(s.charAt(i) == '*' && !x){
                c++;
            }
        }
        return c;
    }
}
