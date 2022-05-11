class Solution {
    public int reverse(int x) {
        long n = 0;
        boolean g = false;
        if(x < 0) {
            g = true;
            x *= -1;
        }
        while(x > 0) {
            if (n*10 > Integer.MAX_VALUE) { 
                return 0;
            }
            n *= 10;
            n += (x%10);
            x = x/10;
        }
        int a = (int)n;
        return g ? a *= -1 : a;
    }
}