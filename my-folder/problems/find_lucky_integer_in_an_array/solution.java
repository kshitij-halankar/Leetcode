class Solution {
    public int findLucky(int[] arr) {
        int i=0,j=0,l=arr.length,c=-1,d=0;
        Arrays.sort(arr);
        for(i=0;i<l;i++){
            d=1;
            for(j=i;j<l;j++){
                if(i!=j && arr[i]==arr[j]){
                    d++;
                    i++;
                }else if(arr[i]<arr[j]){
                    break;
                }
            }
            // System.out.println(d+" "+arr[i]);
            if(d==arr[i]){
                c=d;
            }
        }
        return c;
    }
}