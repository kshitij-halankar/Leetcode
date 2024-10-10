class Solution {
    public int scoreOfString(String s) {
        int i = 0, n = s.length(), score = 0;
        for (i = 0; i < n-1; i++){
            int j = s.charAt(i);
            int k = s.charAt(i+1);
            score += Math.abs(j - k);
        }
        return score;
    }
}
