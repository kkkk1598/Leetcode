class FindSumPairs {
    // use Two Sum approach
    private int[] nums1;
    private int[] nums2;
    Map<Integer, Integer> map = new HashMap<>();

    // initiazlie arrays
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        // fill the map with the elements of nums2 for comparison
        for(int i: nums2){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int preEle = nums2[index];
        nums2[index] += val;
        map.put(preEle, map.get(preEle) - 1);
        map.put(nums2[index], map.getOrDefault(nums2[index],0) + 1 );
    }
    
    public int count(int tot) {
        int res = 0;
        for(int i: nums1){
            int newEle = tot - i;
            res += map.getOrDefault(newEle, 0);
        }
        return res;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */