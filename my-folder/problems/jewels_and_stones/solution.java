class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> a = new ArrayList<>();
        a.addAll(jewels.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
        
        ArrayList<Character> b = new ArrayList<>();
        b.addAll(stones.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
        int n = 0;
        for(char s:b) {
            if(a.contains(s)) {
                n++;
            }
        }
        return n;
    }
}