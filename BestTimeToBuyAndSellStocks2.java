class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int max2 = 0;
        int minIdx = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < min){
                min = Math.min(min,prices[i]);
                minIdx = i;
            }
            
            if(prices[i + 1] > min){

                max = Math.max(max,prices[i + 1] - min);
            }
            if(prices[i + 1] > prices[i]){
                max2 = max2 + prices[i + 1] - prices[i];
            }
        }
     
        return Math.max(max, max2);
    }
}
