class Solution {
    public int addDigits(int num) {
        int c=0;
        if(num<10){
            return num;
        }
        while(num>0){
            c+=num%10;
            num/=10;
            if (num == 0 && c > 9){
                num = c;
                c=0;
            }
        }
        return c;
    }
}
