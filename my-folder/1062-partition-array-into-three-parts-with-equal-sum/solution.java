class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
//         int i=0,l=arr.length,a=0,b=0,c=0,d=0;
//         for(i=0;i<l;i++){
//             c+=arr[i];
//         }
//         System.out.println(c);
//         if(c==0){
//             for(i=0;i<l;i++){
//                 // if(arr[i] != 0){
//                 //     return false;
//                 // }
//                 a+=arr[i];
//                 if(a==0){
//                     d++;
//                 }
//             }
            
//             return d>2;
//         } else if(c%3==0){
//             b=c/3;
//             System.out.println(b);
//             for(i=0;i<l;i++){
//                 a+=arr[i];
//                 // System.out.println("a: "+a);
//                 if(a==b){
//                     d++;
//                     System.out.println("a: "+a + " d: "+d);
//                     a=0;
//                 } else {
//                     if(a>b){
//                         // if(d == 1 || i == l-1){
//                         if(i == l-1){
//                             return false;
//                         }
//                     }
//                 }
//             }
//         } else {
//             return false;
//         }
//         return d>=3;
        
        int s = Arrays.stream(arr).sum(), c = 0, b = s / 3, d = 0;
        for (int a : arr) {
            c += a;
            if (c == b) {
                ++d;
                c = 0;
            }
        }
        return d >= 3 && s % 3 == 0;
    }
}
