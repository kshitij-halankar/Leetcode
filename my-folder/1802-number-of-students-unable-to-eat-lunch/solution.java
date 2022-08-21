class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i=0,j=0,l1=students.length;
        List<Integer> st = new ArrayList<>();
        List<Integer> sa = new ArrayList<>();
        for(i=0;i<l1;i++){
            st.add(students[i]);
            sa.add(sandwiches[i]);
        }
        while(sa.size() > 0){
            int k = st.get(0);
            if(k == sa.get(0)){
                st.remove(0);
                sa.remove(0);
                j=0;
                // is++;
            } else {
                if(j>st.size()){
                    break;
                }
                st.remove(0);
                st.add(k);
                j++;
                // is++;
            }
        }
        return st.size();
    }
}
