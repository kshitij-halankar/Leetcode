class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int i=0,c=0,t=0, l=satisfaction.length;
        for(i=l-1; i>=0; i--){
            if(satisfaction[i] > -t){
                t+=satisfaction[i];
                c+=t;
            }
        }
        return c;
    }
}