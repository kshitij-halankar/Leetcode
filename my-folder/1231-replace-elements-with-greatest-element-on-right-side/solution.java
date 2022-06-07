class Solution {
    public int[] replaceElements(int[] arr) {
        int i=0,j=0,l=arr.length;
        int k[] = new int[l];
        for(i=0;i<l-1;i++){
            int max = arr[i+1];
            for(j=i+1;j<l;j++){
                if(arr[j]>max){
                    max = arr[j];
                }
                k[i]=max;
            }
        }
        k[l-1]=-1;
        return k;
    }
}
