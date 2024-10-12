import java.util.*;

class Solution {
    public static int[] getSneakyNumbers(int[] nums) {
        int i = 0, n = nums.length, j = n-1, c = 0;
        HashSet<Integer> h = new HashSet<>();
        int[] s = new int[2];
        for (i = 0; i < n; i++) {
            if (h.contains(nums[i])){
                s[c] = nums[i];
                c++;
            } else {
                h.add(nums[i]);
            }
        }
        return s;
    }
}
