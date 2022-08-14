class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0,j=0,l=tickets.length,c=0;
        while(tickets[k]>0){
            for(i=0;i<l;i++){
                if(tickets[i]>0){
                    tickets[i]--;
                    c++;
                }
                if(tickets[k] == 0){
                    break;
                }
                // System.out.println(i+" : "+tickets[i]);
            }
        }
        return c;
    }
}