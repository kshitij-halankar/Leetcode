class Solution {
    public String[] findWords(String[] words) {
        String k1="qwertyuiopQWERTYUIOP",k2="asdfghjklASDFGHJKL",k3="zxcvbnmZXCVBNM";
        int i=0,l=words.length;
        List<String> b=new ArrayList<>();
        for(i=0;i<l;i++){
            int j=0,l1=words[i].length(),d=0;
            if(k1.contains(""+words[i].charAt(0))){
                for(j=0;j<l1;j++){
                    if(k1.contains(""+words[i].charAt(j))){
                        d++;
                    }
                }
            } else if(k2.contains(""+words[i].charAt(0))){
                for(j=0;j<l1;j++){
                    if(k2.contains(""+words[i].charAt(j))){
                        d++;
                    }
                }
            }else{
                for(j=0;j<l1;j++){
                    if(k3.contains(""+words[i].charAt(j))){
                        d++;
                    }
                }
            }
            if(d==l1){
                b.add(words[i]);
            }
        }
        int n=b.size();
        String [] k = new String[n];
        for(i=0;i<n;i++){
            k[i]=b.get(i);
        }
        return k;
    }
}
