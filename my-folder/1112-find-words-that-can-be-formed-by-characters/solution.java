class Solution {
    public int countCharacters(String[] words, String chars) {
        int i=0,l=words.length, cl=chars.length(),c=0;
        List<Character> x=new ArrayList<>();
        for(i=0;i<cl;i++){
            x.add(chars.charAt(i));
        }
        for(i=0;i<l;i++){
            int j=0,wl=words[i].length();
            int k=0;
            List<Character> h=new ArrayList<>(x);
            Collections.copy(h,x);
            for(j=0;j<wl;j++){
                char v=words[i].charAt(j);
                // System.out.println("words[i].charAt(j): "+v);
                if(h.contains(v)){
                    // System.out.println("inside if: "+v);
                    k++;
                    h.remove(h.indexOf(v));
                }
            }
                    // System.out.println("k: "+k);
            if(k==wl){
                    // System.out.println("inside if: "+k);
                c+=k;
            }
        }
        return c;
    }
}
