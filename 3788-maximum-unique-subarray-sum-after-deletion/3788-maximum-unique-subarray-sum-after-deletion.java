class Solution {
    public int maxSum(int[] nums) {
        int res = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        int minNegative = -100;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] <= 0){
                minNegative = Math.max(minNegative, nums[i]);
            } else{
                set.add(nums[i]);
            }
        }
        if(set.isEmpty()) return minNegative;

        for(int i: set){
            res += i;
        }

        return res;
    }
}