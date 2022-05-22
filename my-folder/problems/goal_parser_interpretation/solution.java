class Solution {
    public String interpret(String command) {
        int l=command.length();
        int i=0;
        String s="";
        for(i=0;i<l;i++){
            if(command.charAt(i)=='G'){
                s+="G";
            } else if(command.charAt(i)=='(') {
                if(command.charAt(i+1)==')') {
                    s+="o";
                    i++;
                } else {
                    s+="al";
                    i+=3;
                }
            }
        }
        return s;
    }
}