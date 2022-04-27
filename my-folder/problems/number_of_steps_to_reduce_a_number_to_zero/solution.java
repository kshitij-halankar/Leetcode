class Solution {
    int steps;
    public int numberOfSteps(int num) {
        reducer(num);
        return steps;
    }
    private int reducer(int num) {
        if(num > 0) {
            steps++;
            if(num % 2 == 0) {
                return reducer(num/2);
            } else {
                return reducer(num-1);
            }
        } else {
            return num;
        }
    }
}