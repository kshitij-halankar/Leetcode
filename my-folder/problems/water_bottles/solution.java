class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c=0,r=0,e=0;
        if(numBottles < numExchange){
            return numBottles;
        }
        while((e + numBottles) >= numExchange){
            // System.out.println("numBottles: "+numBottles + " e: " +e+ " c: "+c+" r: "+r);
            c+=numBottles;
            e=numBottles+r;
            numBottles = e / numExchange;
            r = e % numExchange;
        }
        return c;
    }
}