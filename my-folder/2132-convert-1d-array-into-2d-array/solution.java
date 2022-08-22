class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int k[][] = new int[m][n];
        int i=0,j=0,l=original.length,x=0;
        if(l > (m*n) || l < (m*n)) {
            return new int[0][0];
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                k[i][j]=original[x];
                x++;
            }
        }
        return k;
    }
}
