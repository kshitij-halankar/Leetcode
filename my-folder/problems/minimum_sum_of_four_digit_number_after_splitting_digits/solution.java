class Solution {
    public int minimumSum(int num) {
        int[] n = new int[4];
        int i=0;
        while(num>0)
        {
            n[i] = num % 10;
            num /= 10;
            i++;
        }
        Arrays.sort(n);
        int n1 = n[0] * 10 + n[2];
        int n2 = n[1] * 10 + n[3];
        return n1 + n2;
    }
}