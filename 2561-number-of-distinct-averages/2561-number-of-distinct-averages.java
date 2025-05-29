class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Integer> res = new HashSet<Integer>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length / 2; i++){
            res.add((nums[i] + nums[nums.length - i - 1]) );
        }

        return res.size();
    }
}