class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=getStr(s);
        String s2=getStr(t);
        return (s1.equals(s2));
    }
    
    private String getStr(String s){
        String s1="";
        int i=0,l=s.length();
        for(i=0;i<l;i++){
            if(s.charAt(i)=='#'){
                if(s1.length()>=2){
                    s1=s1.substring(0,s1.length()-1);
                } else {
                    s1="";
                }
            } else {
                s1+=s.charAt(i);
            }
        }
        return s1;
    }
}
