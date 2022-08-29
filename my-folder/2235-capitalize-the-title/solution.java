class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        int i=0,j=0,l=words.length;
        for(i=0;i<l;i++){
            String a="";
            if(words[i].length()>2){
                // a+=""+ (words[i].charAt(0)).toString().toUpperCase();
                a+=""+ ("" + words[i].charAt(0)).toUpperCase();
                for(j=1;j<words[i].length();j++){
                    a+=""+ ("" + words[i].charAt(j)).toLowerCase();
                    // a+=""+ words[i].charAt(j).toString().toLowerCase();
                }
            } else {
                a = words[i].toLowerCase();
            }
            words[i]=a;
        }
        title="";
        for(i=0;i<l;i++){
            title+=words[i]+" ";
        }
        return title.substring(0,title.length()-1);
    }
}
