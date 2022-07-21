class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=0,j=0,l=arr.length;
        for(i=0;i<l;i++){
            if(arr[i]%2!=0){
                j++;
                if(j==3){
                    return true;
                }
            } else{
                j=0;
            }
        }
        return false;
    }
}