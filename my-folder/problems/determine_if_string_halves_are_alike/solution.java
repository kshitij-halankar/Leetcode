class Solution {
    public boolean halvesAreAlike(String s) {
        int l=s.length();
        List<String> a=new ArrayList<>();
        a.add("a");
        a.add("e");
        a.add("i");
        a.add("o");
        a.add("u");
        a.add("A");
        a.add("E");
        a.add("I");
        a.add("O");
        a.add("U");
        int c1=0,c2=0,i=0;
        for(i=0;i<l/2;i++){
            if(a.contains(""+s.charAt(i))){
                c1++;
            }
            if(a.contains(""+s.charAt(l-1-i))){
                c2++;
            }
        }
        return c1==c2;
    }
}