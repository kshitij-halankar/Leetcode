class Solution {
    public int findSpecialInteger(int[] arr) {
        int i=0,l=arr.length,m=l/4,a=arr[0],c=1;
        // if(l%4==0){
        //     m=l/4;
        // } else {
        //     m=l/4;
        // }
        for(i=1;i<l;i++){
            // System.out.println("l: "+l+" m: "+m+" ar: "+arr[i]+" c:"+c);
            if(arr[i]==a){
                c++;
                if(c>m){
                    return arr[i];
                }
            } else {
                c=1;
                a=arr[i];
            }
        }
        return arr[l-1];
    }
}
