class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int i=0, j=0, l=heights.length;
        for(i=0;i<l;i++){
            for(j=i;j<l;j++){
                if(heights[i]<heights[j]){
                    int t=heights[i];
                    heights[i]=heights[j];
                    heights[j]=t;
                    String x = names[i];
                    names[i]=names[j];
                    names[j]=x;
                }
            }
        }
        return names;
    }
}
