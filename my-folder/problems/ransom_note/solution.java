class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count = 0;
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        for(int i = 0; i< r.length; i++) {
            for(int j = 0; j < m.length; j++) {
                if(r[i] == m[j]) {
                    count++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(m);
                    sb.deleteCharAt(j);
                    m = sb.toString().toCharArray();
                    break;    
                }
            }
        }
        if (count == r.length)
            return true;
        else
            return false;
    }
}