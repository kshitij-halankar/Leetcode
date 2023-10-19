class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i = 0, j = 0, n = nums.size(), p = 0;
        for(i=0; i<n-1; i++) {
            for(j=i+1; j<=n-1; j++) {
                if((nums.get(i) + nums.get(j) < target)) {
                    p++;
                }
            }
        }
        return p;
    }
}
