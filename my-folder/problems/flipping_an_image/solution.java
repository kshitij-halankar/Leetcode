class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int i=0,j=0,l=image.length, k=image[i].length;
        int x[][] = new int[l][k];
        for(i=0;i<l;i++){
            int c=0;
            for(j=k-1;j>=0;j--){
                x[i][c] = image[i][j] ^ 1;
                    c++;
            }
        }
        return x;
    }
}