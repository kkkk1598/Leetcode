class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // initialize result list
        List<List<Integer>> res = new ArrayList<>();
        //sort the input array
        Arrays.sort(nums);
        //interate through the array
        for(int i = 0; i<nums.length; i++){
            // skip duplicate elements
            if(i>0 && nums[i - 1] == nums[i]){
                continue;
            }
            // initialize pointers
            int j = i + 1;
            int k = nums.length - 1;

            //two pointer apprach
            while(j < k) {
                //caculate total
                int total = nums[i] + nums[j] + nums[k];

                //adjust pointers based on total
                if(total > 0){
                    k--;
                } else if(total < 0){
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    //handle duplicate triplets
                    while(nums[j] == nums[j -1] && j<k){
                        j++;
                    }
                }
            }
            
        }
        
        //return result        
        return res;
    }
}