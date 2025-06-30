class Solution {
    public int findLHS(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxLength = 0;
        
        // Check each number and its successor
        for(int key : map.keySet()) {
            if(map.containsKey(key + 1)) {
                maxLength = Math.max(maxLength, map.get(key) + map.get(key + 1));
            }
        }
        
        return maxLength;
    }
}