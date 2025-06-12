class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxInt = 0;
        for(int i = 1; i<nums.length; i++){
            maxInt = Math.max(maxInt,Math.abs(nums[i] - nums[i - 1]));
        }
        
        maxInt = Math.max(maxInt, Math.abs(nums[nums.length - 1] - nums[0]));
        return maxInt;
    }
}