class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,ls=s.length(),lt=t.length();
        // while(i<lt){
        //     while(j<ls){
        //         if(s.charAt(j)==t.charAt(i)){
        //             j++;
        //         }
        //         i++;
        //         if(i>lt-1){
        //             break;
        //         }
        //     }
        //     if(i>lt-1){
        //         break;
        //     }
        // }
        // return (j==ls-1);
        while(i<ls){
            for(j=0;j<lt;j++){
                if(s.charAt(i)==t.charAt(j)){
                    // System.out.println("i: "+s.charAt(i)+" t: "+t.charAt(j));
                    i++;
                }
                // System.out.println(j+" : "+(lt));
                if(j>lt-1 || i==ls){
                    break;
                }
            }
            // System.out.println(j+" : "+(lt));
            if(j>lt-1 || i==ls){
                break;
            }
        }
        // System.out.println(i+" : "+(ls));
        return (i==ls);
    }
}
