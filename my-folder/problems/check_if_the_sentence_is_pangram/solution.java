class Solution {
    public boolean checkIfPangram(String sentence) {
        int i=0;
        String a="abcdefghijklmnopqrstuvwxyz";
        for(i=0;i<26;i++){
            if(!sentence.contains(""+a.charAt(i))){
                return false;
            }
        }
        return true;
    }
}