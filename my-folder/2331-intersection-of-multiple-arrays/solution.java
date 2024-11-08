class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> a = new ArrayList<>();
        int[] c = new int[1001];
        int d = nums.length, i = 0;
        for (int[] num : nums) {
            for (int n : num) {
                c[n]++;
            }
        }
        for (i = 0; i < 1001; i++) {
            if (c[i] == d)
                a.add(i);
        }
        return a;
    }
}
