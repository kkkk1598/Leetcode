class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int start = nums[0];
        for(int i = 1; i<nums.length; i++){
            // set new 
            if(nums[i] > start) {
                max = Math.max(max, nums[i] - start);
            } else {
                start = nums[i];
            }

        }
        

        return max;
    }
}