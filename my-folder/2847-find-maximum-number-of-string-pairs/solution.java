class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int i = 0, j = 0, n = words.length, c = 0;
        for (i = 0; i < n - 1; i++) {
            for (j = i+1; j < n; j++) {
                if (words[i].charAt(0) == words[j].charAt(1) &&
                    words[i].charAt(1) == words[j].charAt(0))
                        c++;
            }
        }
        return c;
    }
}
