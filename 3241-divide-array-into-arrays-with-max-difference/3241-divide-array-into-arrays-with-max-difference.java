class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] result = new int[nums.length / 3][3];
        Arrays.sort(nums);
        int index = 0;
        for(int i = 0; i<nums.length - 2; i+=3){
            if(nums[i + 2] - nums[i] <= k){
                result[index] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
                index++;
            } else {
                // If any triplet doesn't satisfy the condition, return empty array
                return new int[0][0];
            }
        }

        return result;
    }
}