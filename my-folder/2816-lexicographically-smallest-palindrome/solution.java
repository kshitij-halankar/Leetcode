class Solution {
    public String makeSmallestPalindrome(String s) {
        int i = 0, n = s.length() - 1;
        char[] c = s.toCharArray();
        while (i < n) {
            if (c[i] != c[n]) {
                c[i] = c[n] = (char) Math.min(c[i], c[n]);
            }
            i++; n--;
        }
        // for (i = 0; i < n / 2; i++) {
        //     if (c[i] != c[n-1-i]) {
        //         c[i] = c[n-1-i] = (char) Math.min(c[i], c[n-1-i]);
        //     }
        // }
        return new String(c);
    }
}
