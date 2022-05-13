class Solution {
    public String sortSentence(String s) {
        String[] k = s.split(" ");
        String[] b = new String[k.length];
        for(String a : k) {
            int i = Integer.parseInt(""+a.charAt(a.length()-1));
            System.out.println(i);
            b[i-1] = a.substring(0,a.length()-1) + " ";
        }
        String c = "";
        for (String a : b)
            c += a;
        return c.substring(0, c.length()-1);
    }
}
