class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0, i = 0;
        int l = operations.length;
        
        for (i = 0; i < l; i++) {
            x = operations[i].contains("++") ? x+1 : x-1;
        }
        return x;
    }
}
