class Solution {
    public int[][] largestLocal(int[][] grid) {
        int i=0, j=0, k=0, l=0, n=grid.length, m = n-2;
        // System.out.println(m);
        int x[][]= new int[m][m];
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                int c=-1;
                for(k=i;k<3+i;k++){
                    for(l=j;l<3+j;l++){
                        if(grid[k][l] > c){
                            c=grid[k][l];
                        }
                    }
                }
                // System.out.println();
                x[i][j]=c;
            }
        }
        return x;
    }
}
