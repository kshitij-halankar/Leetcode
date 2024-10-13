class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int i = 0, n = hours.length, c = 0;
        for (i = 0; i < n; i++) {
            if(hours[i] >= target)
                c++;
        }
        return c;
    }
}
