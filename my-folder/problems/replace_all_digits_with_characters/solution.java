class Solution {
    public String replaceDigits(String s) {
        int i=0,l=s.length();
        String s1="";
        for(i=0;i<l;i+=2){
            if(i+1!=l){
                s1+="" + s.charAt(i) + (char) (Integer.parseInt(""+s.charAt(i+1)) + s.charAt(i));
            } else {
                s1+=""+s.charAt(i);
            }
        }
        return s1;
    }
}