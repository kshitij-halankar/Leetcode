class Solution {
    public int countDigits(int num) {
        int c = 0, n = num;
        while(n > 0) {
            int d = n % 10;
            if (num % d == 0)
                c++;
            n = n / 10;
        }
        return c;
    }
}
