class Solution {
    public int countKeyChanges(String s) {
        int i = 0, n = s.length(), c = 0, p = (int) s.charAt(0);
        for (i = 1; i < n; i++) {
            int d = (int) s.charAt(i);
            if (d != p && d != p + 32 && d != p - 32) {
                p = d;
                c++;
            }
        }
        return c;
    }
}
