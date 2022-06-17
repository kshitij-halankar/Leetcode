class Solution {
    public int findComplement(int num) {
        int c=0,i=0;
        for(i=0;i<num;i++){
            c+=Math.pow(2,i);
            if(c>=num)
                break;
        }
        return c-num;
    }
}