class Solution {
    public int balancedStringSplit(String s) {
        int l = s.length();
        int i = 0, c = 0, a = 0;
        for (i = 0; i < l; i++) {
            if (s.charAt(i) == 'R') {
                a++;
            } else {
                a--;
            }
            if (a == 0) {
                c++;
            }
        }
        return c;
    }
}
