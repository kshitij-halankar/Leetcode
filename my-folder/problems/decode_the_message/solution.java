class Solution {
    public String decodeMessage(String key, String message) {
        int i=0,l=key.length(), n=message.length();
        HashMap<Character,Character> x = new HashMap<>();
        char c='a';
        x.put(' ', ' ');
        for(i=0;i<l;i++){
            if(!x.containsKey(key.charAt(i))){
                x.put(key.charAt(i),c);
                c++;
            }
        }
        String s="";
        for(i=0;i<n;i++){
            s+=""+x.get(message.charAt(i));
        }
        return s;
    }
}