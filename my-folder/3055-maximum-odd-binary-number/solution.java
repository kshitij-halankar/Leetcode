class Solution {
    public String maximumOddBinaryNumber(String s) {
        int i = 0, n = s.length(), h = 0, m = 0;
        for (i = 0; i < n; i++) {
            if (s.charAt(i) == '1') h++;
            else m++;
        }
        s = "";
        for (i = 0; i < h - 1; i++)
            s += "1";
        for (i = 0; i < m; i++)
            s += "0";
        s += "1";
        return s;
    }
}
