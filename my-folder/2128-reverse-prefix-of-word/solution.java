class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0, n = word.length();
        String s = word;
        if (word.contains(""+ch)) {
            s = "";
            int k = word.indexOf(ch);
            for (i = k; i >= 0; i--) {
                s += "" + word.charAt(i);
            }
            s += word.substring(k+1,n);
        }
        return s;
    }
}
