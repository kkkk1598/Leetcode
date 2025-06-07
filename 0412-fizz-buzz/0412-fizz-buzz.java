class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();

        for(int i = 1; i<= n; i++){
            String ele = "";
            if(i % 3 != 0 && i % 5 != 0){
                ele = Integer.toString(i);
            }
            if(i % 3 == 0) {
                ele += "Fizz";
            }
            if(i % 5 == 0){
                ele += "Buzz";
            }

            res.add(ele);
        }
        return res;
    }
}