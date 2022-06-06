class Solution {
    public boolean digitCount(String num) {
        int i=0,l=num.length();
        int[] a = new int[l];
        for(char c : num.toCharArray()){
            if((c-'0')>=l) return false;
            a[c-'0']++;
        }
        for(i = 0; i<l; i++){
            if(num.charAt(i)-'0' != a[i]) return false;
        }
        return true;
    }
}
