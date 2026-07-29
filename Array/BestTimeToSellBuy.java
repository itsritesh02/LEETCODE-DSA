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





// public class BestTimeToSellBuy {
//   // BestTimeToSellBuy naam ki class banayi.

//   static int profitMax(int prices[]) {
//     // profitMax() function stock prices ka array lega
//     // aur maximum profit return karega.

//     int min = prices[0];
//     // Sabse pehle day ki price ko minimum maan liya.
//     // Ye ab tak ki sabse sasti buying price hogi.

//     int profit = 0;
//     // Starting me profit 0 hai.
//     // Abhi tak kuch buy/sell nahi kiya.

//     for (int i = 1; i < prices.length; i++) {
//       // Second day se last day tak ek-ek price check karenge.

//       if (prices[i] < min) {
//         // Agar current price minimum se bhi chhoti hai,
//         // to ise nayi buying price bana do.

//         min = prices[i];
//         // Minimum price update kar di.
//       }

//       if (prices[i] - min > profit) {
//         // Agar current day par sell karne se
//         // purane profit se zyada profit mil raha hai,
//         // to profit update karo.

//         profit = prices[i] - min;
//         // Maximum profit update kar diya.
//       }

//     }

//     return profit;
//     // Final maximum profit return kar do.
//   }

//   public static void main(String[] args) {
//     // Program execution yahin se start hota hai.

//     int[] prices = { 5, 2, 8, 1, 9, 4 };
//     // Stock prices ka input array.

//     System.out.println("Maximum Profit: " + profitMax(prices));
//     // Function call kiya aur answer print kar diya.
//   }
// }