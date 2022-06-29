class Solution {
    public int prefixCount(String[] words, String pref) {
        int i=0,j=0,c=0,l=words.length,lp=pref.length();
        for(i=0;i<l;i++){
            if(words[i].contains(pref)){
                int a=0;
                for(j=0;j<lp;j++){
                    if(pref.charAt(j)==words[i].charAt(j)){
                        a++;
                    }
                }
                if(lp==a){
                    c++;
                }
            }
        }
        return c;
    }
}