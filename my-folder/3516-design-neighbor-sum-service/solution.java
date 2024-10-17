class NeighborSum {
    int n = 0;
    Map<Integer,int[]> m;
    public NeighborSum(int[][] grid) {
        n = grid.length;
        m = new HashMap<>();
        int i = 0, j = 0, a = 0, d = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i - 1 > -1) a += grid[i - 1][j];
                if (i + 1 < n) a += grid[i + 1][j];
                if (j - 1 > -1) a += grid[i][j - 1];
                if (j + 1 < n) a += grid[i][j + 1];

                if (i - 1 > -1 && j - 1 > -1) d += grid[i - 1][j - 1];
                if (i - 1 > -1 && j + 1 < n) d += grid[i - 1][j + 1];
                if (i + 1 < n && j - 1 > -1) d += grid[i + 1][j - 1];
                if (i + 1 < n && j + 1 < n) d += grid[i + 1][j + 1];

                m.put(grid[i][j], new int[]{a, d});
                a = d = 0;
            }
        }
    }
    
    public int adjacentSum(int value) {
        return m.get(value)[0];
    }
    
    public int diagonalSum(int value) {
        return m.get(value)[1];
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
