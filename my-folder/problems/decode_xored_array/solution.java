class Solution {
    public int[] decode(int[] encoded, int first) {
        int l = encoded.length;
        int[] a = new int[l + 1];
        int i = 0;
        a[0] = first;
        for (i = 0; i < l; i++) {
            a[i+1] = a[i] ^ encoded[i];
        }
        return a;
    }
}