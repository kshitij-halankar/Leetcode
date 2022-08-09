class Solution {
    public int titleToNumber(String columnTitle) {
        int i=0,l=columnTitle.length(),c=0;
        for(i=0;i<l;i++){
            c=(26 * c) + (Character.getNumericValue(columnTitle.charAt(i))-9);
        }
        return c;
    }
}