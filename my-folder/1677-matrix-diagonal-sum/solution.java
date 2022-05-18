class Solution {
    public int diagonalSum(int[][] mat) {
        int l=mat.length;
        int i=0,s=0;
        for(i=0;i<l;i++){
            s+=mat[i][i] + mat[i][l-i-1];
        }
        if(l%2!=0){
            s-=mat[l/2][l/2];
        }
        return s;
    }
}
