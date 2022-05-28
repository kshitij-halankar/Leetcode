class Solution {
    public boolean areOccurrencesEqual(String s) {
        int i=0,l=s.length(),m=0;
        // HashMap<char,int> k=new HashMap<>();
        int[] a=new int[26];
        for(i=0;i<l;i++){
            switch(s.charAt(i)){
                case 'a': a[0]++; if(a[0]>m){m=a[0];} break;
                case 'b': a[1]++; if(a[1]>m){m=a[1];} break;
                case 'c': a[2]++; if(a[2]>m){m=a[2];} break;
                case 'd': a[3]++; if(a[3]>m){m=a[3];} break;
                case 'e': a[4]++; if(a[4]>m){m=a[4];} break;
                case 'f': a[5]++; if(a[5]>m){m=a[5];} break;
                case 'g': a[6]++; if(a[6]>m){m=a[6];} break;
                case 'h': a[7]++; if(a[7]>m){m=a[7];} break;
                case 'i': a[8]++; if(a[8]>m){m=a[8];} break;
                case 'j': a[9]++; if(a[9]>m){m=a[9];} break;
                case 'k': a[10]++;if(a[10]>m){m=a[10];}  break;
                case 'l': a[11]++;if(a[11]>m){m=a[11];}  break;
                case 'm': a[12]++;if(a[12]>m){m=a[12];}  break;
                case 'n': a[13]++;if(a[13]>m){m=a[13];}  break;
                case 'o': a[14]++;if(a[14]>m){m=a[14];}  break;
                case 'p': a[15]++;if(a[15]>m){m=a[15];}  break;
                case 'q': a[16]++;if(a[16]>m){m=a[16];}  break;
                case 'r': a[17]++;if(a[17]>m){m=a[17];}  break;
                case 's': a[18]++;if(a[18]>m){m=a[18];}  break;
                case 't': a[19]++;if(a[19]>m){m=a[19];}  break;
                case 'u': a[20]++;if(a[20]>m){m=a[20];}  break;
                case 'v': a[21]++;if(a[21]>m){m=a[21];}  break;
                case 'w': a[22]++;if(a[22]>m){m=a[22];}  break;
                case 'x': a[23]++;if(a[23]>m){m=a[23];}  break;
                case 'y': a[24]++;if(a[24]>m){m=a[24];}  break;
                case 'z': a[25]++;if(a[25]>m){m=a[25];}  break;
            }
        }
        for(i=0;i<26;i++){
                if(a[i] >0 && a[i] != m) {
                    return false;
                }
            }
        return true;
    }
}
