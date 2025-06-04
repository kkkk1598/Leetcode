class Solution {
    public int maxProfit(int[] prices) {
        // cannot achieve any profit
        if(prices.length <= 1) return 0;
        int buyDay = 0;
        // base case
        int maxProfit = prices[1] - prices[0];

        // using Sliding Window.
        for(int j = 1; j < prices.length; j++){
            // if jth price is smaller, then move the buying day
            if(prices[j] <= prices[buyDay]){
                buyDay = j;
                continue;
            } else{ // otherwise, compare with differnt day in the future
                maxProfit = Math.max(maxProfit, prices[j] - prices[buyDay]);
            }
        }

        // return maximum profit from this transaction, if cannot achieve any profit, return 0.
        return Math.max(maxProfit,0);
    }
}