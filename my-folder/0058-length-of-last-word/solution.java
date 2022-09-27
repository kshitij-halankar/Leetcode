class Solution {
    public int lengthOfLastWord(String s) {
        String x[] = s.split(" ");
        int i=0,c=0,l=x.length;
        // for(i=0;i<l;i++){
        //     System.out.println(x[i]);
        // }
        c=x[l-1].length();
        return c;
    }
}
