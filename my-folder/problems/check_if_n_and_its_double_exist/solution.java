class Solution {
    public boolean checkIfExist(int[] arr) {
        int i=0,j=0,l=arr.length;
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(arr[i]*2 == arr[j] && i!=j){
                    // System.out.println(arr[i]+":"+arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
}