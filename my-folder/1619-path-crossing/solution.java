class Solution {
    public boolean isPathCrossing(String path) {
        int l=path.length();
        int i=0,x=0,y=0;
        Set<String> s=new HashSet<>();
        s.add(""+x+":"+y);
        for(i=0;i<l;i++){
            switch(path.charAt(i)){
                case 'N':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'S':
                    y--;
                    break;
            }
            if(s.contains(""+x+":"+y)){
                return true;
            } else {
                s.add(""+x+":"+y);
            }
        }
        return false;
    }
}
