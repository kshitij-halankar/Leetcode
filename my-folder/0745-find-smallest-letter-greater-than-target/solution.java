class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i=0,l=letters.length;
        if(target > letters[l-1] || target < letters[0]){
            return letters[0];
        } else {
            for(i=0;i<l;i++){
            // System.out.println("x: "+x+" c: "+c);
                if( letters[i] > target){
                    return letters[i];
                } else if (letters[i] == target) {
                    if(i<l-1){
                        if(letters[i+1] > target)
                            return letters[i+1];
                    } else {
                        return letters[0];
                    }
                }
            }
        }
        return 'x';
    }
}
