class Solution {
    public boolean makeEqual(String[] words) {
        int i=0,j=0,l=words.length,c=0;
        HashMap<Character,Integer> x=new HashMap<>();
        for(i=0;i<l;i++){
            String t=words[i];
            int ll=t.length();
            c+=ll;
            for(j=0;j<ll;j++){
                char a=t.charAt(j);
                if(x.containsKey(a)){
                    x.put(a,x.get(a)+1);
                } else {
                    x.put(a,1);
                }
            }
        }
        if(c%l!=0){
            return false;
        } else {
            for(Map.Entry<Character,Integer> m: x.entrySet()){
                if(m.getValue()%l != 0){
                    return false;
                }
            }
        }
        return true;
//         for(i=0;i<l;i++){
//             c+=words[i].length();
//         }
//         if(c%l!=0){
//             return false;
//         } else{
            
//         }
    }
}
