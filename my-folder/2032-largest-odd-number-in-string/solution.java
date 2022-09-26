class Solution {
    public String largestOddNumber(String num) {
        int i=0,l=num.length(),c=0;
        for(i=l-1;i>=0;i--){
            c=Character.getNumericValue(num.charAt(i));
            // System.out.println("c: "+c);
            if(c%2!=0){
                String x = num.substring(0,i+1);
                // System.out.println("x: "+x);
                // if(x.isEmpty()){
                //     x=""+c;
                // }
                return x;
            }
        }
        return "";
    }
}
