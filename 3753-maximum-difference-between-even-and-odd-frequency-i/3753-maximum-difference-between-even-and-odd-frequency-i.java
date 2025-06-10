class Solution {
    public int maxDifference(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++){
            String key = s.substring(i,i+1);
            if(map.containsKey(key)){
                map.put(key, map.getOrDefault(key, 0) + 1);
            } 
            map.putIfAbsent(key,1);
        }

        for(Integer i: map.values()){
            if(i > maxOdd && i % 2 == 1){
                maxOdd = i;
            }
            if(i < minEven && i % 2 == 0 ){
                minEven = i;
            }
        }
        if(minEven == Integer.MAX_VALUE ){
            minEven = 0;
        }

        int max = maxOdd - minEven;
        return max;
    }
}