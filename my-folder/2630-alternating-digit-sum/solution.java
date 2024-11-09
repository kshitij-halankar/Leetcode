class Solution {
    public int alternateDigitSum(int n) {
        int t = 1, l = 0;
        while (t <= n) {
            l++;
            t *= 10;
        }
        int s = 0, i = (l % 2 == 0) ? -1 : 1;
        while (n > 0) {
            s += (i == 1) ? (n % 10) : (n % 10) * -1;
            n /= 10;
            i *= -1;
        }
        return s;
    }
}
