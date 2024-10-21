class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int i = 0, j = 0, n = queries.length, m = words.length;
        int[] a = new int[n], w = new int[m];
        for (i = 0; i < m; i++) {
            w[i] = getFrequency(words[i].toCharArray());
        }
        for (i = 0; i < n; i++) {
            int c = 0;
            int f = getFrequency(queries[i].toCharArray());
            for (j = 0; j < m; j++) {
                if (f < w[j]) {
                    c++;
                }
            }
            a[i] = c;
        }
        return a;
    }

    public int getFrequency(char[] x) {
        Arrays.sort(x);
        int f = 1, i = 1, n = x.length;
        char c = x[0];
        while (i < n && x[i] == c) {
            f++;
            i++;
        }
        return f;
        // char c = 'z';
        // int f = 1, i = 0;
        // for (i = 0; i < x.length; i++) {
        //     if (x[i] < c) {
        //         c = x[i];
        //         f = 1;
        //     } else if (x[i] == c) {
        //         f++;
        //     }
        // }
        // return f;
    }
}
