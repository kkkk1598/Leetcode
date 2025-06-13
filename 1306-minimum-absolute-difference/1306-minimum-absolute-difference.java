class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int minCheck = arr[1] - arr[0];
        List<Integer> ele = new ArrayList<>(){
            {
                add(arr[0]);
                add(arr[1]);
            }
        };

        res.add(ele);

        for(int i = 1; i< arr.length - 1; i++){
            int curr = (arr[i + 1] - arr[i]);
            if( curr <  minCheck){
                minCheck = curr;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (curr == minCheck){
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else {
                continue;
            }
        }

        return res;
    }
}