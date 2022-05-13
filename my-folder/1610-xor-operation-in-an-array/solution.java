class Solution {
    public int xorOperation(int n, int start) {
        int i = 0, x = 0;
        for (i = 0; i < n; i++) {
             x = x ^ (start + (2 * i));
        }
        return x;
    }
}
