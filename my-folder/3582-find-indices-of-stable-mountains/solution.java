class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
         int i = 0, n = height.length;
         List<Integer> l = new ArrayList<>();
         for (i = 1; i < n; i++) {
            if (height[i-1] > threshold) 
                l.add(i);
         }
         return l;
    }
}
