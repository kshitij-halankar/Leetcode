class Solution {
    public int romanToInt(String s) {
        int converter = 0;
        // if (validateInput(s)) {
        char prevChar = 'a';
        char[] roman = s.toCharArray();
        for(char r:roman){
            switch(r) {
                case 'I':
                    converter += 1;
                    break;
                case 'V':
                    if (prevChar == 'I'){
                        converter += 3;
                    } else {
                        converter += 5;
                    }
                    break;
                case 'X':
                    if (prevChar == 'I'){
                        converter += 8;
                    } else {
                        converter += 10;
                    }
                    break;
                case 'L':
                    if (prevChar == 'X'){
                        converter += 30;
                    } else {
                        converter += 50;
                    }
                    break;
                case 'C':
                    if (prevChar == 'X'){
                        converter += 80;
                    } else {
                        converter += 100;
                    }
                    break;
                case 'D':
                    if (prevChar == 'C'){
                        converter += 300;
                    } else {
                        converter += 500;
                    }
                    break;
                case 'M':
                    if (prevChar == 'C'){
                        converter += 800;
                    } else {
                        converter += 1000;
                    }
                    break;
            }
            prevChar = r;
        }
        System.out.println(converter);
        // }
        // else {
        //     System.out.println("invalid input");
        // }
        return converter;
    }
    
    // public boolean validateInput(String s){
    //     return ((s.length()<=15) && (s.matches("((?![IVXLCDM]).)"))) ? false : true;
    // }
}