class Solution {
    public boolean checkZeroOnes(String s) {
        int i=0,oc=0,zc=0,mo=0,mz=0,l=s.length();
        for(i=0;i<l;i++){
            if(s.charAt(i)=='1'){
                oc++;
                zc=0;
                if(oc>mo){
                    mo=oc;
                }
            }else{
                zc++;
                oc=0;
                if(zc>mz){
                    mz=zc;
                }
            }
        }
        return mo>mz;
        // String[] o=s.split("1");
        // String[] z=s.split("0");
        // int i=0,mo=0,mz=0;
        // for(i=0;i<o.length;i++){
        //     if(o[i].length() > mo){
        //         mo=o[i].length();
        //     }
        // }
        // for(i=0;i<z.length;i++){
        //     if(z[i].length() > mz){
        //         mz=o[i].length();
        //     }
        // }
        // System.out.println("mo: "+mo);
        // System.out.println("mz: "+mz);
        // return mo>mz;
    }
}
