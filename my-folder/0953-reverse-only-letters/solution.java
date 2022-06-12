import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Solution {
    public String reverseOnlyLetters(String s) {
        Pattern p=Pattern.compile("[a-zA-Z]");
        String s1="",s3="";
        int i=0,j=0,l=s.length();
        for(i=0;i<l;i++){
            String s2=""+s.charAt(i);
            Matcher m=p.matcher(s2);
            if(m.matches()){
                s1+=m.group();
            }
        }
        // System.out.println(s1);
        j=s1.length()-1;
        for(i=0;i<l;i++){
            String s2=""+s.charAt(i);
            Matcher m=p.matcher(s2);
            if(!m.matches()){
                s3+=s2;
            }else{
                s3+=""+s1.charAt(j);
                j--;
            }
        }
        return s3;
    }
}
