class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] k=text.split(" ");
        int i=0,j=0,l=brokenLetters.length(),l2=k.length, c=k.length;
        for(i=0;i<l;i++){
            for(j=0;j<l2;j++){
                if(k[j].contains(""+brokenLetters.charAt(i))){
                    k[j]="";
                    c--;
                }
            }
        }
        return c;
    }
}