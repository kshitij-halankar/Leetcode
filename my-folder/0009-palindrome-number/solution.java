class Solution {
    public boolean isPalindrome(int x) {
        String a=""+x,b="";
        int i=0,l=a.length();
        for(i=l-1;i>=0;i--){
            b+=a.charAt(i);
        }
        // System.out.println("a: "+a+" b: "+b);
        return b.equals(a);
    }
}
