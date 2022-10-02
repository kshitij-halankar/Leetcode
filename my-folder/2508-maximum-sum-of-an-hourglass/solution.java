class Solution {
    public int maxSum(int[][] grid) {
        int i=0,j=0,m=grid.length,n=grid[0].length, c=0,mc=0;
        for(i=0;i<m-2;i++){
            for(j=0;j<n-2;j++){
                c = grid[i][j] + grid[i][j+1] + grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                // System.out.println("i:"+i+ " j:"+j+ " c:"+c);
                if(c>mc){
                    mc=c;
                }
            }
        }
        return mc;
    }
}
