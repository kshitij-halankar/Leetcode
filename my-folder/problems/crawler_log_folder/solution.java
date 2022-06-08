class Solution {
    public int minOperations(String[] logs) {
        int i=0;
        ArrayList <String> a = new ArrayList<>();
        for(String s:logs){
            switch(s){
                case "../":
                    if(i>0){
                        a.remove(i-1);
                        i--;
                    }
                    break;
                case "./":
                    break;
                default:
                    a.add(s);
                    i++;
                    break;
            }
        }
        return a.size();
    }
}