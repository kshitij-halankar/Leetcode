class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int l1 = seats.length;
        int l2 = students.length;
        int i = 0, j = 0, c = 0;
        
        for(i=0;i<l1;i++){
            for(j=0;j<=i;j++){
                if(seats[i]<seats[j]){
                    int t=seats[i];
                    seats[i]=seats[j];
                    seats[j]=t;
                }
                if(students[i]<students[j]){
                    int t=students[i];
                    students[i]=students[j];
                    students[j]=t;
                }
            }
        }
        
        for(i=0;i<l1;i++){
            c+=Math.abs(students[i]-seats[i]);
        }
        return c;
    }
}
