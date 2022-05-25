class Solution {
    public List<String> cellsInRange(String s) {
        String k[] = s.split(":");
        char b = k[0].charAt(0);
        char e = k[1].charAt(0);
        int l=(int)k[0].charAt(1);
        int h=(int)k[1].charAt(1);
        List<String> a = new ArrayList<>();
        int i=0,j=0;
        for(i=b;i<=e;i++){
            for(j=l;j<=h;j++){
                a.add(""+(char)i+(char)j);
            }
        }
        return a;
    }
}
