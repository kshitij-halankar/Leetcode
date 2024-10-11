class Solution {
    public int findPermutationDifference(String s, String t) {
        int i = 0, n = s.length(), d = 0;
        for (i = 0; i < n; i++) {
            d += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return d;
    }
}
