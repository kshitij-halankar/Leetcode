class Solution {
    public String restoreString(String s, int[] indices) {
        int l = indices.length;
        int i = 0;
        char[] g = new char[l];
        for(i=0;i<l;i++){
            g[indices[i]] = s.charAt(i);
        }
        return String.valueOf(g);
    }
}