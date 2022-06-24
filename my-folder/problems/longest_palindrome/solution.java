class Solution {
    public int longestPalindrome(String s) {
        int i=0,l=s.length();
        HashSet<Character> x = new HashSet<Character>();
        for(i=0; i<l; i++){
            char c=s.charAt(i);
            if(x.contains(c)){
                x.remove(c);
            }else{
                x.add(c);
            }
        }
        int c=x.size();
        return l-((c==0)?0:c-1);
    }
}