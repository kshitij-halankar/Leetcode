class Solution {
    public String frequencySort(String s) {
        int i=0,j=0,l=s.length();
        HashMap<Character,Integer> x=new HashMap<>();
        for(i=0;i<l;i++){
            x.put(s.charAt(i), x.getOrDefault(s.charAt(i),0)+1);
        }
        LinkedHashMap<Character,Integer> lm=new LinkedHashMap<>();
        x.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(m -> lm.put(m.getKey(), m.getValue()));
        s="";
        for(Map.Entry<Character,Integer>m:lm.entrySet()){
            for(i=0;i<m.getValue();i++){
                s+=""+m.getKey();
            }
        }
        return s;
    }
}
