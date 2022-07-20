class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String k[]=text.split(" ");
        int i=0,j=0,l=k.length;
        String s="";
        for(i=0;i<l-2;i++){
            if(k[i].equals(first) && k[i+1].equals(second)){
                // if(!k[i+2].equals(first) && !k[i+2].equals(second)){
                    // System.out.println(i+2);
                    // System.out.println(k[i+2]);
                    // System.out.println(first);
                    // System.out.println(second);
                    s+=k[i+2]+" ";
                // }
            }
        }
        if(s.length()>0){
            s=s.substring(0,s.length()-1);
            return s.split(" ");
        } else{
            // String d[]=new String[1];
            // d[0]="";
            // return d;
            return new String[0];
        }
        
    }
}
