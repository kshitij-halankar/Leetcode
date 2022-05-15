class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int l1 = word1.length;
        int l2 = word2.length;
        int i = 0;
        String a = "", b = "";
        for (i = 0; i < l1; i++) {
            a += word1[i];
        }
        for (i = 0; i < l2; i++) {
            b += word2[i];
        }
        return a.equals(b);
    }
}