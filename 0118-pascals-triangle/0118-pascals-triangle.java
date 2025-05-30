class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        // base case
        if(numRows == 0){
            return res;
        }

        // base case
        if(numRows == 1){
            List<Integer> first = new ArrayList<>();
            first.add(1);
            res.add(first);
            return res;
        }

        res = generate(numRows - 1);
        // since ArrayList is 0 index start
        List<Integer> prev = res.get(numRows - 2);
        List<Integer> curr = new ArrayList<>();
        // add first 1 into each Pascal's tirangle
        curr.add(1);

        for(int i = 1; i<numRows - 1; i++){
            curr.add(prev.get(i - 1) + prev.get(i));
        }
        // add last 1 into each Pascal's triangle
        curr.add(1);

        // add row into result;
        res.add(curr);

        return res;
    }
}