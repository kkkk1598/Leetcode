class Solution {
    public int findLucky(int[] arr) {
        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        // count a frequency
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // set for iteration
        Set<Integer> keys = map.keySet();

        // check the largest lucky integer
        for(Integer i: keys){
            if(i == map.get(i) && map.get(i) > result){
                result = map.get(i);
            }
        }

        return result;
    }
}