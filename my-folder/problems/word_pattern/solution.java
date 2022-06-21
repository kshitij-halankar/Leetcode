class Solution {
    public boolean wordPattern(String pattern, String s) {
        int i=0,l=pattern.length();
        String a[]=s.split("\s");
        if(l!=a.length){
            return false;
        }
        Map<Character, String> m=new HashMap<>();
        for(i=0;i<l;i++){
            char c=pattern.charAt(i);
            if(m.containsKey(c)){
                if(!m.get(c).equals(a[i])){
                    return false;
                }
            }else{
                List<String> v = new ArrayList<>(m.values());
                if(v.contains(a[i])){
                    return false;
                }
                m.put(c,a[i]);
            }
        }
        return true;
    }
}