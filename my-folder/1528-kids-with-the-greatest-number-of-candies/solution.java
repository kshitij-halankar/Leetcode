class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i = 0, n = candies.length, max = 0;
        List<Boolean> c = new ArrayList<>();
        for (i = 0; i < n; i++) {
            max = candies[i] > max ? candies[i] : max;
            candies[i] += extraCandies;
        }
        for (i = 0; i < n; i++) {
            c.add(i, candies[i] >= max);
        }
        return c;
    }
}
