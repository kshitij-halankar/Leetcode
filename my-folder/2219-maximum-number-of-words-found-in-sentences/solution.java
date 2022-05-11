class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = 0;
        for (String s : sentences) {
            String[] k = s.split("\\s");
            if (k.length > n) {
                n = k.length;
            }
        }
        return n;
    }
}
