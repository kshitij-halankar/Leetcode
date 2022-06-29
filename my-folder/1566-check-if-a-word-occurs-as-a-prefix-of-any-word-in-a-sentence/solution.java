class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i=0,j=0,l=searchWord.length();
        String s[]=sentence.split(" ");
        int l2=s.length;
        for(i=0;i<l2;i++){
            if(s[i].contains(searchWord)){
                int c=0;
                for(j=0;j<l;j++){
                    if(searchWord.charAt(j)==s[i].charAt(j)){
                        c++;
                    }
                }
                if(c==l){
                    return i+1;
                }
            }
        }
        return -1;
    }
}
