class Solution {
    public char repeatedCharacter(String s) {
        int i=0,l=s.length();
        HashSet<Character> x=new HashSet<>();
        if(l==1){
            return s.charAt(0);
        }
        for(i=0;i<l;i++){
            if(x.contains(s.charAt(i))){
                return s.charAt(i);
            } else {
                x.add(s.charAt(i));
            }
        }
        // char c='x';
        // for(i=0;i<l;i++){
        //     for(j=i+1;j<l;j++){
        //         if(s.charAt(j) == s.charAt(i)){
        //             int b=j-i;
        //             if(b<a){
        //                 a=b;
        //                 c=s.charAt(j);
        //             }
        //         }
        //     }
        // }
        return 'a';
    }
}