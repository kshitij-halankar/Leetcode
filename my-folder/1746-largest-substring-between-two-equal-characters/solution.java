class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int i = 0, n = s.length(), c = -1;
        for (i = 0; i < n; i++) {
            int l = s.lastIndexOf(s.charAt(i) + "");
            int d = l > i ? l - 1 - i : -1;
            if (d > c) {
                c = d;
            }
        }
        return c;
    }
}
