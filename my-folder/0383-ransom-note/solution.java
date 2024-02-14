class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i=0, j=0, r=ransomNote.length(), m=magazine.length();
        if(r > m) return false;
        char[] rn = ransomNote.toCharArray();
        char[] mg = magazine.toCharArray();
        Arrays.sort(rn);
        Arrays.sort(mg);
        // System.out.println(rn);
        // System.out.println(mg);
        while(i < r && j < m){
            // System.out.println("rn: "+ rn[i] + " mg: " + mg[j]);
            if (rn[i] == mg[j]) {
                i++;
                j++;
            } else if (rn[i] < mg[j]) {
                return false;
            } else {
                j++;
            }
        }
        if (j == m && i!= r) {
            return false;
        }
        return true;
    }
}


        // List<Character> rn = new ArrayList<>(
        //     ransomNote.chars()
        //     .mapToObj(c -> (char)c)
        //     .collect(Collectors.toList())
        // );
        // List<Character> mg = new ArrayList<>(
        //     magazine.chars()
        //     .mapToObj(c -> (char)c)
        //     .collect(Collectors.toList())
        // );
        // rn.sort();
        // mg.sort();
        // while(i < r){
        //     if(rn.get(i) == mg.get(j)) {
        //         i++;
        //         j++;
        //     } else if(rn.get(i) > mg.get(j)) {
        //         return false;
        //     } else {
        //         j++;
        //     }
        // }
