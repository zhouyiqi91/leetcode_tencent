
/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。

*/
public class Lc121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] rest_max = new int[len];
        int current_max = prices[len-1];
        for (int i = len-1;i>=0;i--){   //是i>=0而非i>0; for先判断，后执行
            if (prices[i] > current_max){
                current_max = prices[i];
            }
            rest_max[i] = current_max;
        }

        int profit_max = 0;
        for (int i = 0;i<len;i++){
            int current_profit_max = rest_max[i] - prices[i];
            if (current_profit_max > profit_max) profit_max = current_profit_max;
        }
        return profit_max;
    }

}