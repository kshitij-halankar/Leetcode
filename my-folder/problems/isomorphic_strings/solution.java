class Solution {
    public boolean isIsomorphic(String s, String t) {
        int i=0,ls=s.length(),lt=t.length();
        Map<Character, Integer> m=new HashMap<>();
        Map<Character, Integer> n=new HashMap<>();
        String s1="",t1="";
        if(ls!=lt){
            return false;
        }
        for(i=0;i<ls;i++){
            char c=s.charAt(i);
            if(!m.containsKey(c)){
                m.put(c,i);
                // System.out.println("c: "+c+" i: "+i);
            }
            s1+=" "+m.get(c);
        }
        for(i=0;i<ls;i++){
            char c=t.charAt(i);
            if(!n.containsKey(c)){
                n.put(c,i);
                // System.out.println("c: "+c+" i: "+i);
            }
            t1+=" "+n.get(c);
        }
        // System.out.println("s1: "+s1+" t1: "+t1);
        return s1.equals(t1);
    }
}