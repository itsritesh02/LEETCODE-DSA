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

//-------------------------------------------------------------------------------------------------------------------

/*
public class BestTimeToSellBuy {
// Hindi: BestTimeToSellBuy naam ki class banayi.
// English: Created a class named BestTimeToSellBuy.

    static int profitMax(int prices[]) {
    // Hindi: profitMax() function stock prices ka array lega
    // aur maximum profit return karega.
    // English: The profitMax() method takes an array of stock prices
    // and returns the maximum profit.

        int min = prices[0];
        // Hindi: Pehle din ki price ko minimum maan liya.
        // English: Assume the first day's price is the minimum buying price.

        int profit = 0;
        // Hindi: Starting me profit 0 hai.
        // English: Initially, the maximum profit is 0.

        for (int i = 1; i < prices.length; i++) {
        // Hindi: Loop second day se last day tak chalega.
        // English: The loop starts from the second day and goes to the last day.

            if (prices[i] < min) {
            // Hindi: Agar current price minimum se bhi chhoti hai,
            // to minimum update karo.
            // English: If the current price is smaller than the minimum price,
            // update the minimum buying price.

                min = prices[i];
                // Hindi: Naya minimum buying price store kar diya.
                // English: Updated the minimum buying price.
            }

            if (prices[i] - min > profit) {
            // Hindi: Check karo current day par sell karne se
            // profit pehle se zyada mil raha hai ya nahi.
            // English: Check whether selling today gives more profit
            // than the current maximum profit.

                profit = prices[i] - min;
                // Hindi: Maximum profit update kar diya.
                // English: Updated the maximum profit.
            }

        }

        return profit;
        // Hindi: Final maximum profit return kar diya.
        // English: Return the maximum profit.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int[] prices = {5, 2, 8, 1, 9, 4};
        // Hindi: Stock prices ka input array.
        // English: Input array of stock prices.

        System.out.println("Maximum Profit: " + profitMax(prices));
        // Hindi: profitMax() function call kiya aur answer print kiya.
        // English: Called the profitMax() method and printed the result.
    }
}
*/