class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int il = mat.length;
        int jl = mat[0].length;
        int i = 0, j = 0;
        int m[] = new int[il];
        int a[] = new int[k];
        int n[] = new int[il];
        for(i = 0; i < il; i++) {
            m[i] = 0;
            n[i] = 0;
            for(j = 0; j < jl; j++) {
                if(mat[i][j] == 1){
                    m[i]++;
                    n[i]++;
                } else {
                    break;
                }
            }
        }
        for(i = 0; i < il; i++){
            for(j = 0; j <= i; j++) {
                if(m[i] < m[j]) {
                    int t = m[i];
                    m[i] = m[j];
                    m[j] = t;
                }
            }
        }
        for(i = 0; i < k; i++) {
            for(j = 0; j < il; j++) {
                if(m[i] == n[j]) {
                    a[i] = j;
                    n[j] = -1;
                    break;
                }
            }
        }
        return a;
    }
}