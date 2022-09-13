class Solution {
    public int firstUniqChar(String s) {
        int i=0,l=s.length();
        if(l==1){
            return i;
        }
        while(i<l){
            char c=s.charAt(i);
            // System.out.println(s);
            String x=s.substring(i+1,l);
            String y="";
            if(i>0){
                y=s.substring(0,i);
            }
            // System.out.println("c: "+c+" x: "+x+" y:"+y);
            
            // l=s.length();
            if(!x.contains(""+c) && !y.contains(""+c)){
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }
}