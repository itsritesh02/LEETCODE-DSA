public class BestTimeToSellBuy {
  static int profitMax(int prices[]) {
    int min = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i];
      }
      if (prices[i] - min > profit) {
        profit = prices[i] - min;
      }

    }
    return profit;
  }

  public static void main(String[] args) {

    int[] prices = { 5, 2, 8, 1, 9, 4 };

    System.out.println("Maximum Profit: " + profitMax(prices));

  }
}