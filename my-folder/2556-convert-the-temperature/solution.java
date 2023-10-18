class Solution {
    public double[] convertTemperature(double celsius) {
        double[] d = { (celsius + 273.15), (celsius * 1.8 + 32.00)};
        return d;
    }
}
