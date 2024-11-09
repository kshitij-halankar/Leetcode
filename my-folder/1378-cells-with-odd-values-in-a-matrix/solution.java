class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int i = 0, j = 0, o = 0, x = indices.length;
        int[][] mx = new int[m][n];
        for (i = 0; i < x; i++) {
            int c = indices[i][0], r = indices[i][1];
            for (j = 0; j < n; j++) {
                mx[c][j]++;
            }
            for (j = 0; j < m; j++) {
                mx[j][r]++;
            }
            // for (int ii = 0; ii < m; ii++) {
            //     for (int jj = 0; jj < n; jj++) {
            //         System.out.print(mx[ii][jj] + " ");
            //     }
            //     System.out.println();
            // }
            // System.out.println("indices " + x);
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (mx[i][j] % 2 != 0) {
                    o++;
                }
                // System.out.print(mx[i][j] + " ");
            }
            // System.out.println();
        }
        return o;
    }
}
