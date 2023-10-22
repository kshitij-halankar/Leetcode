class Solution {
    public int sumOfMultiples(int n) {
        int i=0, s=0;
        for(i=1; i<=n; i++) {
            if(i%3 == 0 || i%5 == 0 || i%7 == 0)
                s+=i;
        }
        return s;
    }
}