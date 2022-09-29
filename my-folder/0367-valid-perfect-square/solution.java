class Solution {
    public boolean isPerfectSquare(int num) {
        double x = Math.pow(num,0.5);
        double y = (double)((int) x);
        // System.out.println("x: "+x+ " y: "+y);
        return y == x;
    }
}
