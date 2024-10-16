class Solution {
    public int pivotInteger(int n) {
        int r = n * (n + 1) / 2;
        int s = (int)Math.sqrt(r);
        return s*s == r ? s : -1;
    }
}
