class Solution {
    public int[] numberOfPairs(int[] nums) {
        int i=0,j=0,l=nums.length;
        int[] x= new int[2];
        x[0]=0;
        x[1]=0;
        List<Integer> n=new ArrayList<>();
        Arrays.sort(nums);
        for(i=0;i<l;i++){
            n.add(nums[i]);
        }
        while(j<l-1){
            if(n.get(j)==n.get(j+1)){
                n.remove(j+1);
                n.remove(j);
                j=0;
                x[0]++;
                l=n.size();
            } else {
                j++;
            }
        }
        x[1]=n.size();
        return x;
    }
}