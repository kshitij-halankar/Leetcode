class Solution {
    public int countPrefixes(String[] words, String s) {
        int i=0,j=0,l=words.length,ls=s.length(),c=0;
        char a[]=s.toCharArray();
        for(i=0;i<l;i++){
            String b=words[i];
            int n=b.length(),k=0;
            for(j=0;j<n;j++){
                if(j<ls && b.charAt(j)==a[j]){
                    k++;
                }
            }
            if(k==n){
                c++;
            }
        }
        return c;
    }
}
