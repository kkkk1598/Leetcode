class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        // pq of pair (value, index)
        PriorityQueue<int[]> maxHeap = 
            new PriorityQueue<>((a,b) -> (b[0] - a[0]));

        for(int i = 0; i<nums.length; i++){
            maxHeap.add(new int[]{nums[i], i});
        }

        
        int[][] selected = new int[k][2];
        for(int i =0; i<k; i++){
            selected[i] = maxHeap.poll();
        }

        // Sort by original index to maintain relative order
        Arrays.sort(selected, (a, b) -> a[1] - b[1]);

        for(int i =0; i<k; i++){
            res[i] = selected[i][0];
        }

        return res;
    }
}