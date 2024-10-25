class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = -1, n1 = word1.length(), n2 = word2.length();
        int n = n1 > n2 ? n1 : n2;
        char[] s = new char[n1+n2];
        for (i = 0; i < n; i++) {
            if (i < n1) s[++j] = word1.charAt(i);
            if (i < n2) s[++j] = word2.charAt(i); 
        }
        return new String(s);
    }
}
