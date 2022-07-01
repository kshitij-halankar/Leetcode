class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int i=0,l=target.length,s=0,d=0,a=0,b=0;
        Set<Integer> k=new HashSet<>();
        // Set<Integer> j=new HashSet<>();
        // Map<Integer,Integer> m=new HashMap<>();
        for(i=0;i<l;i++){
            a+=target[i];
            b+=arr[i];
            s^=target[i];
            d^=arr[i];
            
            // if(s.contains(target[i])){
            //     s.remove(target[i]);
            // } else {
            k.add(target[i]);
            // }
        }
        for(i=0;i<l;i++){
            // if(s.contains(arr[i])){
            k.remove(arr[i]);
            // } else {
            //     s.add(arr[i]);
            // }
            // m.put(target[i],m.getOrDefault(target[i],0)+1);
            // m.put(arr[i],m.getOrDefault(arr[i],0)-1);
        }
        return k.size()==0 && s==d && a==b;
        // return (s==d && a==b);
    }
}
