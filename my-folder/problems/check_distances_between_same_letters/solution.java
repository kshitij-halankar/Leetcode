class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int i=0,j=0,l=s.length();
        for(i=0;i<l;i++){
            char c=s.charAt(i);
            int d=distance[c-97];
            if((i+d+1<l && s.charAt(i+d+1) == c) || (i-d-1 >= 0 && s.charAt(i-d-1) == c)){
                // System.out.println("c: "+c+" i:"+i+" sid:"+s.charAt(i+d+1));
                // System.out.println("c: "+c+" i:"+i+" sid:"+s.charAt(i-d-1));
                // return false;
            } else {
                return false;
            }
        }
        return true;
    }
}