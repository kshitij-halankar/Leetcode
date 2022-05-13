class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0, i = 0;
        int l = items.size();
        for(i = 0; i < l; i++) {
            List<String> a = items.get(i);
            switch(ruleKey) {
                case "type":
                    if(a.get(0).equals(ruleValue)) {
                        c++;
                    }
                    break;
                case "color":
                    if(a.get(1).equals(ruleValue)) {
                        c++;
                    }
                    break;
                case "name":
                    if(a.get(2).equals(ruleValue)) {
                        c++;
                    }
                    break;
            }
        }
        return c;
    }
}