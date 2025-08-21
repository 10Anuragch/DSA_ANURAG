public class BuyAndSell_Stocks {
    public static int buyAndSell_Stocks(int prices_arr[]) {
        // int buyPrice=Integer.MAX_VALUE;
        int buyPrice = prices_arr[0];
        int maxprofit = 0;
        for (int i = 0; i < prices_arr.length; i++) {
            if (buyPrice < prices_arr[i]) {// profit
                int profit = prices_arr[i] - buyPrice;// today's profit
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyPrice = prices_arr[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices_arr[] = { 7, 1, 5, 3, 6, 4 };
        System.err.println("Max profit = " + buyAndSell_Stocks(prices_arr));
    }
}
