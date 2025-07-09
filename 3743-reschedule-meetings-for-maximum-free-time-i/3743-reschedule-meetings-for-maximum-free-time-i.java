class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] breakTime = new int[n + 1];
        breakTime[0] = startTime[0] - 0;
        breakTime[n] = eventTime - endTime[n- 1];
        // store breakTimes
        for(int i = 1; i < n; i++){
            breakTime[i] = startTime[i] - endTime[i - 1];
        }
        int currentSum = 0;
        for(int i = 0; i <k + 1; i++){
            currentSum += breakTime[i];
        }
        int maxSum = currentSum;
        // compare k + 1 consecutive breakTime length to find the longest continuous free time
        for(int i = k + 1; i<breakTime.length; i++){
            currentSum = currentSum + breakTime[i] - breakTime[i - k - 1];
            maxSum = Math.max(maxSum,currentSum);
        }
        
        return maxSum;
    }
}