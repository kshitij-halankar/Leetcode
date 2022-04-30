class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0, j = 0, f = 0, c = 0;
        char l;
        String a = "";
        int len = strs.length;
        char[][] x = new char[len][];
        for (i = 0; i < len; i++) {
            x[i] = strs[i].toCharArray();
        }
        
        for (j = 0; j < x[0].length; j++) {
            c = 0;
            l = x[0][j];
            for (i = 0; i < len; i++) {
                if (j < x[i].length && l == x[i][j]) {
                    c++;
                }
            }
            if (c == len) {
                a += l;
            } else {
                break;
            }
        }
        return a;
    }
}