class Solution {
    public int partitionArray(int[] nums, int k) {
        int count = 1;
        // array is empty
        if(nums == null) return 0;
        Arrays.sort(nums);
        int pivot = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] - nums[pivot] <= k){
                continue;
            } else{
                count++;
                pivot = i;
            }
        }

        return count;
    }
}