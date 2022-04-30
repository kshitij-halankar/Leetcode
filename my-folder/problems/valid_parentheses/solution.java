class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        char[] stack = new char[len];
        int i = 0, b = 0, k = 0;
        while(i < len) {
            char c = s.charAt(i);
            switch(c) {
                case ')':
                    if (k == 0) {
                        return false;
                    }
                    if(stack[k-1] == '(') {
                        stack[k-1] = 0;
                        k--;
                    } else {
                        stack[k] = c;
                        k++;
                    }
                    break;
                case ']':
                    if (k == 0) {
                        return false;
                    }
                    if(stack[k-1] == '[') {
                        stack[k-1] = 0;
                        k--;
                    } else {
                        stack[k] = c;
                        k++;
                    }
                    break;
                case '}':
                    if (k == 0) {
                        return false;
                    }
                    if(stack[k-1] == '{') {
                        stack[k-1] = 0;
                        k--;
                    } else {
                        stack[k] = c;
                        k++;
                    }
                    break;
                default:
                    stack[k] = c;
                    k++;
                    break;
            }
            i++;
        }
        return (k==0);
    }
}