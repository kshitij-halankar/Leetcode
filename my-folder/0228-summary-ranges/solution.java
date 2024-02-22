class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0, n=nums.length, start=0, end=0;
        String range="";
        List<String> ranges = new ArrayList<>();
        for(i=0; i<n; i++){
            if(range.isEmpty()){
                start = nums[i];
                range = "" + start;
                end = start + 1;
            } else {
                if(nums[i] == end){
                    if(i < n-1){
                        end++;
                    } else {
                        range += "->" + nums[i];
                        ranges.add(range);
                        range = "";
                    }
                } else {
                    i--;
                    if(nums[i] > start) {
                        range += "->" + nums[i];
                    }
                    ranges.add(range);
                    range = "";
                }
            }
        }
        if(!range.isEmpty()){
            ranges.add(range);
        }

        return ranges;
    }
}
