class Solution {
    public String removeOuterParentheses(String s) {
        int l=s.length();
        int i=0,c=0;
        String a="";
        for(i=0;i<l;i++){
            if(c!=0){
                if(s.charAt(i)=='('){
                    c++;
                } else {
                    c--;
                }
                if(c!=0) {
                    a+=s.charAt(i);
                }
            } else {
                if(s.charAt(i)=='('){
                    c++;
                } else {
                    c--;
                }
            }
            
        }
        return a;
    }
}