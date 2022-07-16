class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int i=0,d=1;
        int k[]=new int[num_people];
        while(candies>0){
            k[i]+=d;
            if(i==num_people-1){
                i=0;
            } else{
                i++;
            }
            candies-=d;
            d++;
            if(d>candies){
                d=candies;
            }
        }
        return k;
    }
}