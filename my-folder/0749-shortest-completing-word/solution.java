class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int i=0,j=0,l=words.length,ll=licensePlate.length(),c=0,wl=0;
        String w="";
        HashMap<Character,Integer> x=new HashMap<>();
        for(j=0;j<ll;j++){
            char g = licensePlate.charAt(j);
            // System.out.println("g: "+g);
            if(g != ' ' && !Character.isDigit(g)){
                if(x.containsKey(g)){
                    // System.out.println("ig: "+g);
                    x.put(g, x.get(g)+1);
                } else {
                    // System.out.println("eg: "+g);
                    x.put(g, 1);
                }
            }
            // System.out.println("x: "+x.size());
        }
        
        for(i=0;i<l;i++){
            int f=0;
            for(Map.Entry<Character,Integer> m:x.entrySet()){
                char a=m.getKey();
                int b=m.getValue();
                // System.out.println("a: "+a);
                int d=(int)words[i].chars().filter(e -> e == a).count();
                if(d < b){
                    f=0;
                    break;
                } else {
                    f++;
                }
            }
            if(f>0){
                if(w.isEmpty() || words[i].length() < wl){
                    w=words[i];
                    wl=w.length();
                }
            }
        }
        return w;
    }
}
