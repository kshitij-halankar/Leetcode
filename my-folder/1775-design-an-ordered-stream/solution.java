class OrderedStream {
    String[] os;
    int ptr;
    public OrderedStream(int n) {
        os = new String[n];
        ptr = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        os[idKey - 1] = value;
        List<String> l = new ArrayList<>();
        while(ptr <= os.length && os[ptr - 1] != null) {
            l.add(os[ptr - 1]);
            ptr++;
        }
        return l;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
