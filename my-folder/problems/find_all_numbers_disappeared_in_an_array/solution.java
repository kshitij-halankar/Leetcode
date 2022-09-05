class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0,l=nums.length,c=1;
        List<Integer> x=new ArrayList<>();
        Arrays.sort(nums);
        while(c<=l){
            if(i>l-1){
                x.add(c);
                c++;
            } else {
                // System.out.println("c: "+c+" n:"+nums[i]);
    //             if(nums[i] != c){

    //             }
                if(nums[i]==c){
                    c++;
                    i++;
                } else if(nums[i]>c){
                    x.add(c);
                    c++;
                } else {
                    if(i==l-1){
                        x.add(c);
                        c++;
                    }
                    i++;
                }
            }
            // i++;
        }
        return x;
    }
}