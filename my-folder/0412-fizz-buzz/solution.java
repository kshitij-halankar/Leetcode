class Solution {
    public List<String> fizzBuzz(int n) {
        int i =1;
        List<String> ans = new ArrayList<>();
        while(i<=n){
            if(i%3==0 && i%5==0){
                ans.add("FizzBuzz");
            }else if(i%3==0){
                ans.add("Fizz");
            }else if(i%5==0){
                ans.add("Buzz");
            }else{
                ans.add(""+i);
            }
            i++;
        }
        return ans;
    }
}
