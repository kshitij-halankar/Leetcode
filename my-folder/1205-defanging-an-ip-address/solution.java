class Solution {
    public String defangIPaddr(String address) {
        String s[] = address.split("\\.");
        
        String a = "";
        for(String b : s) {
            a = a + b + "[.]";
        }
        a = a.substring(0, a.length() - 3);
        return a;
    }
}
