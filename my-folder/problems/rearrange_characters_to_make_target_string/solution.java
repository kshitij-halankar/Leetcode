class Solution {
    public int rearrangeCharacters(String s, String target) {
        int i=0,l=s.length(),l1=target.length(),c=0,d=0;
        List<Character> x = new ArrayList<>();
        for(i=0;i<l;i++){
            x.add(s.charAt(i));
        }
        while(true){
            for(i=0;i<l1;i++){
                char cc = target.charAt(i);
                if(x.contains(cc)){
            // System.out.println("cc: "+cc);
                    d++;
                    x.remove(x.indexOf(cc));
                } else {
                    d=-1;
                    break;
                }
            }
            // System.out.println(d);
            if(d==-1){
                break;
            } else if(d==l1){
                c++;
                d=0;
            }
            i++;
        }
        return c;
    }
}