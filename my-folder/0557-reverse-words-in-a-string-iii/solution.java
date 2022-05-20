class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        String c="";
        int j=0;
        for(String b:a){
            String k="";
            int l=b.length();
            int i=0;
            for(i=l-1;i>=0;i--){
                k+=b.charAt(i);
            }
            c+=k+" ";
        }
        return c.substring(0,c.length()-1);
    }
}
