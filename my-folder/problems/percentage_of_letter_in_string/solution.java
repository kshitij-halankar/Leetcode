class Solution {
    public int percentageLetter(String s, char letter) {
        int i=0,l=s.length(),c=0;
        for(i=0;i<l;i++){
            if(Character.compare(letter, s.charAt(i))==0){
                c++;
            }
        }
        return (int)(((double)c/l)*100);
    }
}