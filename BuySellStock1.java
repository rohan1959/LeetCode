121. Best Time to Buy and Sell Stock -- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit =0;
         int buyPrice = Integer.MAX_VALUE;
        for(int i =0; i< prices.length;i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            else if( maxProfit < prices[i] -buyPrice  ){
                maxProfit = prices[i] - buyPrice;
            }
        }
        
        return maxProfit;
        
    }
}
