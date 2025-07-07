class Solution {
    public int maxEvents(int[][] events) {
        int len = events.length;
        int maxDay = 0;
        // find the maximum end day
        for(int[] event: events){
            maxDay = Math.max(maxDay, event[1]);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // sort its start days in ascending order
        Arrays.sort(events, (a,b) -> a[0]- b[0]);
        int ans = 0;
        for(int i =1, j= 0; i<=maxDay; i++){
            // store days by earlist end day
            while(j < len && events[j][0] <= i){
                pq.offer(events[j][1]);
                j++; // increament j to avoid duplication and keep going
            }
            // remove expired day
            while(!pq.isEmpty() && pq.peek() < i){
                pq.poll();
            }
            // Attend best event
            if(!pq.isEmpty()){
                pq.poll();
                ans++;
            }

        }

        return ans;
    }
}