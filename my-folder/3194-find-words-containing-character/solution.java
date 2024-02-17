class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int i=0, n=words.length;
        List<Integer> d = new ArrayList<>();
        for(i=0; i<n; i++){
            if(words[i].contains(""+x)){
                d.add(i);
            }
        }
        return d;
    }
}
