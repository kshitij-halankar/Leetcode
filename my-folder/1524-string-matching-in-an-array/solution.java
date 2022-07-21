class Solution {
    public List<String> stringMatching(String[] words) {
        int i=0,j=0,l=words.length;
        List<String> k=new ArrayList<>();
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(i!=j && words[j].contains(words[i])){
                    if(!k.contains(words[i])){
                        k.add(words[i]);
                    }
                }
            }
        }
        return k;
    }
}
