
public class Lc122 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len<2) return 0;
        int max_profit = 0;
        for (int i = 1;i<len;i++){
            if (prices[i]>prices[i-1]) max_profit += prices[i]-prices[i-1];
        }
        return max_profit;
    }


}