class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        a:
        for(String a:words) {
            int l=a.length();
            int i=0;
            for (i=0;i<l;i++) {
                if (!(allowed.contains(""+a.charAt(i)))) {
                    continue a;
                }
            }
            c++;
        }
        return c;       
    }
}