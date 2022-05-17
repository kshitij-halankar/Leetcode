class Solution {
    public String truncateSentence(String s, int k) {
        String[] a = s.split(" ");
        String b = "";
        int i = 0;
        for (i = 0; i < k; i++) {
            b += a[i] + " ";
        }
        return b.substring(0, b.length()-1);
    }
}
