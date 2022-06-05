class Solution {
    public boolean judgeCircle(String moves) {
        int l=moves.length(),i=0,x=0,y=0;
        for(i=0;i<l;i++){
            switch(moves.charAt(i)){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return (x==0 && y==0);
    }
}
