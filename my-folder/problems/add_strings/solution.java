class Solution {
    public String addStrings(String num1, String num2) {
        int l1=num1.length(), l2=num2.length();
        if(l1>l2){
            return add(l1, l2, num1, num2);
        } else {
            return add(l2, l1, num2, num1);
        }
    }
    public String add(int l1, int l2, String n1, String n2){
        int i=0,r=0,a=0, l = l1 - l2;
        String x="";
        for(i=0;i<l;i++){
            n2="0"+n2;
        }
        // System.out.println(n2);
        // System.out.println(n1);
        for(i=l1-1;i>=0;i--){
            a = Character.getNumericValue(n1.charAt(i)) + Character.getNumericValue(n2.charAt(i)) + r;
            // System.out.println("a: "+a);
            if(a>9){
                r=1;
                a = a % 10;
            } else {
                r=0;
            }
            // System.out.println("a:"+a+" r:"+r);
            x=a+x;
        }
        if(r>0){
            x=r+x;
        }
        return x;
    }
}