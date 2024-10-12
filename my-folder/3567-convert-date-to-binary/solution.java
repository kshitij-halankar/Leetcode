class Solution {
    public String convertDateToBinary(String date) {
        String[] s = date.split("-");
        String r = "";
        for(String d:s){
            r += Integer.toBinaryString(Integer.valueOf(d)) + "-";
        }
        return r.substring(0,r.length()-1);
    }
}
