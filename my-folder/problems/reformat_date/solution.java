class Solution {
    public String reformatDate(String date) {
        String s="", a[]=date.split(" ");
        int d1=Character.getNumericValue(a[0].charAt(0)),d2=0;
        String d="";
        if(a[0].charAt(1)=='s' || a[0].charAt(1)=='r' || a[0].charAt(1)=='t' || a[0].charAt(1)=='n'){
            d="0"+d1;
        }else{
            d2=Character.getNumericValue(a[0].charAt(1));
            int d3=(d1*10)+d2;
            d=""+d3;
        }
        String m="";
        switch(a[1]){
            case "Jan":m="01";break;
            case "Feb":m="02";break;
            case "Mar":m="03";break;
            case "Apr":m="04";break;
            case "May":m="05";break;
            case "Jun":m="06";break;
            case "Jul":m="07";break;
            case "Aug":m="08";break;
            case "Sep":m="09";break;
            case "Oct":m="10";break;
            case "Nov":m="11";break;
            case "Dec":m="12";break;
        }
        s=""+a[2]+"-"+m+"-"+d;
        return s;
    }
}