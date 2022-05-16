class Solution {
    public int maxDepth(String s) {
        int l = s.length();
        int i = 0, c = 0, b = 0;
        for (i = 0; i < l; i++) {
            if (s.charAt(i) == '(') {
                c++;
            } else if (s.charAt(i) == ')') {
                c--;
            }
            if(c > b) {
                b = c;
            }
        }
        return b;
    }
}
