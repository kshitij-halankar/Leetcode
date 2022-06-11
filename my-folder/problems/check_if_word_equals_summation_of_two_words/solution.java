class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (convert(firstWord) + convert(secondWord) == convert(targetWord));
    }
    private int convert(String word){
        String s="";
        int i=0,l=word.length();
        for(i=0;i<l;i++){
            int n=word.charAt(i)-97;
            // System.out.println(n);
            s+=n;
        }
        return Integer.parseInt(s);
    }
}