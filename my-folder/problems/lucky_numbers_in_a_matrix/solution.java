class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int lc = matrix.length, lr = matrix[0].length, i=0,j=0;
        int[] mr = new int[lc], mc = new int[lr];
        List<Integer> lucky = new ArrayList<>();
        Arrays.fill(mr, Integer.MAX_VALUE);
        for (i = 0; i < lc; i++) {
            for (j = 0; j < lr; j++) {
                // mr[i]=matrix[i][0];
                if(matrix[i][j]<mr[i]){
                    mr[i]=matrix[i][j];
                }
                if(matrix[i][j]>mc[j]){
                    mc[j]=matrix[i][j];
                }
                // mr[i] = Math.min(matrix[i][j], mr[i]);
                // mc[j] = Math.max(matrix[i][j], mc[j]);
                // System.out.println("r: "+mi[i]);
                // System.out.println("c: "+mx[j]);
            }
        }
        for(i = 0; i < lc; i++) {
            for (j = 0; j < lr; j++) {
                // System.out.println("r: "+mi[i]);
                // System.out.println("c: "+mx[j]);
                if (mr[i] == mc[j])  {
                    lucky.add(mr[i]);
                }
            }
        }
        return lucky;        
    }
}