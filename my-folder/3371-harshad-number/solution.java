class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int i = 0, j = x;
        while(x > 0) {
            i += x % 10;
            x = x / 10;
        }
        return j % i == 0 ? i : -1;
    }
}
