class Solution {
    public boolean checkString(String s) {
        int i=0,l=s.length(),c=0;
        for(i=0;i<l;i++){
            if(s.charAt(i)=='b'){
                c++;
            }
            if(s.charAt(i)=='a' && c>0){
                return false;
            }
        }
        return true;
    }
}
