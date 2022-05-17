class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int l = arr.length;
        int i = 0, j = 0, k = 0, t = 0;
        for (k = 2; k < l; k++) {
            for (j = 1; j < l-1 && j < k; j++) {
                for (i = 0; i < l-2 && i < j && i < k; i++) {
                    if(Math.abs(arr[i] - arr[j]) <= a
                      && Math.abs(arr[j] - arr[k]) <= b
                      && Math.abs(arr[i] - arr[k]) <= c) {
                        t++;
                    }
                }
            }
        }
        return t;
    }
}