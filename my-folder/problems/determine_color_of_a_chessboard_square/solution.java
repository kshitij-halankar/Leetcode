class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        int n=(Character.getNumericValue(coordinates.charAt(1)))%2;
        if(a=='a' || a=='c' || a=='e' || a=='g'){
            return n==0;
        }else{
            return n==1;
        }
    }
}