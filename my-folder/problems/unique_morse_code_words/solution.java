class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int c=0,j=0;
        Set<String> x=new HashSet<>();
        for(String s:words){
            char[] a=s.toCharArray();
            int i=0,l=a.length;
            String b="";
            for(i=0;i<l;i++){
                switch(a[i]){
                    case 'a':
                        b+=".-";
                        break;
                    case 'b':
                        b+="-...";
                        break;
                    case 'c':
                        b+="-.-.";
                        break;
                    case 'd':
                        b+="-..";
                        break;
                    case 'e':
                        b+=".";
                        break;
                    case 'f':
                        b+="..-.";
                        break;
                    case 'g':
                        b+="--.";
                        break;
                    case 'h':
                        b+="....";
                        break;
                    case 'i':
                        b+="..";
                        break;
                    case 'j':
                        b+=".---";
                        break;
                    case 'k':
                        b+="-.-";
                        break;
                    case 'l':
                        b+=".-..";
                        break;
                    case 'm':
                        b+="--";
                        break;
                    case 'n':
                        b+="-.";
                        break;
                    case 'o':
                        b+="---";
                        break;
                    case 'p':
                        b+=".--.";
                        break;
                    case 'q':
                        b+="--.-";
                        break;
                    case 'r':
                        b+=".-.";
                        break;
                    case 's':
                        b+="...";
                        break;
                    case 't':
                        b+="-";
                        break;
                    case 'u':
                        b+="..-";
                        break;
                    case 'v':
                        b+="...-";
                        break;
                    case 'w':
                        b+=".--";
                        break;
                    case 'x':
                        b+="-..-";
                        break;
                    case 'y':
                        b+="-.--";
                        break;
                    case 'z':
                        b+="--..";
                    break;
                }
            }
            x.add(b);
            j++;
        }
        return x.size();
    }
}