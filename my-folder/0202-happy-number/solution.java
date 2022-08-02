class Solution {
    public boolean isHappy(int n) {
        List<Integer> l=new ArrayList<>();
        while(n!=1){
            int d=0;
            while(n>0){
                int x=n%10;
                d+=Math.pow(x,2);
                n/=10;
            }
            if(l.contains(d)){
                return false;
            } else {
                l.add(d);
                n=d;
            }
        }
        return true;
    }
}
