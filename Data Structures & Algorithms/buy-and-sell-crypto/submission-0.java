class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices [0];
        for (int i = 1; i<prices.length; i++) {
            int current = prices[i];
            if(buy>current){
                buy = current;
            }
            int currentProfit = current-buy;
            if(currentProfit > profit) {
                profit = currentProfit;
            }
        }
        return profit;
    }
}
