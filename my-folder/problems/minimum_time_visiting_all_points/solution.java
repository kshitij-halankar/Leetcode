class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int i=0,j=0,l=points.length,c=0;
        for(i=0;i<l-1;i++){
            c+= Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        return c;
    }
}