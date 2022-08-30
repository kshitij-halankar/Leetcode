class Solution {
    public boolean detectCapitalUse(String word) {
        int i=0,l=word.length();
        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())){
            return true;
        } else {
            if(Character.isUpperCase(word.charAt(0))){
                String a=word.substring(1,word.length());
                if(a.equals(a.toLowerCase())){
                    return true;
                }
            }
        }
        return false;
//         for(i=0;i<l;i++){
            
//         }
    }
}