class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int i = 0, n = words.size(), m = s.length(), c = 0;
        for (i = 0; i < n; i++) {
            if (i >= m || words.get(i).charAt(0) != s.charAt(i))
                return false;
            c++;
        }
        return c == m;
    }
}
