class Solution {
    public int minimumChairs(String s) {
        int c = 0, m = 0;
        for (char a : s.toCharArray()) {
            c = (a == 'E') ? c + 1 : c - 1;
            if (c > m) m = c;
        }
        return m;
    }
}
