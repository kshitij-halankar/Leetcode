class Solution {
    public String reverseVowels(String s) {
        int i=0,j=0,l=s.length();
        String a="";
        int c[] = new int[l];
        for(i=0;i<l;i++){
            c[i]=-1;
        }
        StringBuilder s1=new StringBuilder(s);
        for(i=0;i<l;i++){
            char b=s.charAt(i);
            if(b=='a' || b=='A'
               || b=='e' || b=='E'
               || b=='i' || b=='I'
               || b=='o' || b=='O'
               || b=='u' || b=='U'){
                a+=""+b;
                c[j]=i;
                j++;
            }
        }
        for(i=0;i<l && c[i]!=-1;i++){
            s1.setCharAt(c[i],a.charAt(j-1));
            j--;
        }
        return s1.toString();
    }
}