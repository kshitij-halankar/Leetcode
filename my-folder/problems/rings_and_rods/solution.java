class Solution {
    public int countPoints(String rings) {
        // int[][] c = new int[10][3];
        // int l = rings.length();
        // int i = 0, b = 0;
        // for (i = 0; i < l; i+=2) {
        //     int a = Integer.parseInt(rings.substring(i+1,i+2));
        //     switch(rings.charAt(i)) {
        //         case 'R':
        //             c[a][0] = 1;
        //             break;
        //         case 'G':
        //             c[a][1] = 1;
        //             break;
        //         case 'B':
        //             c[a][2] = 1;
        //             break;
        //     }
        // }
        // for (i = 0; i < 10; i++) {
        //     if (c[i][0] == 1 && c[i][1] == 1 && c[i][2] == 1) {
        //         b++;
        //     }
        // }
        // return b;
        int i = 0, c = 0;
        for (i = 0; i < 10; i++) {
            if (rings.contains("R"+i) && rings.contains("G"+i) && rings.contains("B"+i)) {
                c++;
            }
        }
        return c;
    }
}