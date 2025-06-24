class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        
        HashSet<Integer> ele = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key) {
                for(int j = 0; j < nums.length; j++){
                    if(Math.abs(j - i) <= k){
                        ele.add(j);
                    }
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>(ele);
        Collections.sort(res);
        return res;
    }
}