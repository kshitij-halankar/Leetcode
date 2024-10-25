class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int i = 0, j = 0, n = batteryPercentages.length, c = 0;
        for (i = 0; i < n; i++) {
            if (batteryPercentages[i] > c) {
                c++;
            }
        }
        // for (i = 0; i < n; i++) {
        //     if (batteryPercentages[i] > 0) {
        //         c++;
        //         for (j = i+1; j < n; j++) {
        //             batteryPercentages[j]--;
        //         }
        //     }
        // }
        return c;
    }
}
