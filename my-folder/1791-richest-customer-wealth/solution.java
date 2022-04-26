class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++) {
                wealth[i] += accounts[i][j];
            }
        }
        for(int i = 0; i < wealth.length; i++) {
            System.out.println(wealth[i]);
            for(int j = 0; j <= i; j++){
                if(wealth[j] <= wealth[i]) {
                    int temp = wealth[i];
                    wealth[i] = wealth[j];
                    wealth[j] = temp;
                }
            }
        }
        return wealth[0];
    }
}
