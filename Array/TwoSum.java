class TwoSum {
  static void Sum(int[] arr) {
    int target = 11;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int ans = arr[i] + arr[j];
        if (ans == target) {
          System.out.println("Indices are: " + i + " , " + j);
          return;
        }

      }
    }
    System.out.println("No pair found");

  }

  public static void main(String[] args) {
    int[] arr = { 4, 2, 5, 8, 6, 1, 3, 7 };
    Sum(arr);
  }
}

//---------------------------------------------------------------------------------------------------
// public class TwoSum {
//   // Hindi: TwoSum naam ki class banayi.
//   // English: Created a class named TwoSum.

//   static void Sum(int[] arr) {
//     // Hindi: Sum() function array lega aur target ke equal sum wale
//     // do elements ke indices print karega.
//     // English: This method takes an array and prints the indices
//     // of two elements whose sum is equal to the target.

//     int target = 11;
//     // Hindi: Target value 11 hai.
//     // English: The target sum is 11.

//     for (int i = 0; i < arr.length; i++) {
//       // Hindi: Outer loop har element ko first number maan kar chalta hai.
//       // English: The outer loop selects the first element of the pair.

//       for (int j = i + 1; j < arr.length; j++) {
//         // Hindi: Inner loop i ke baad wale elements ko check karta hai.
//         // English: The inner loop checks all elements after i.

//         int ans = arr[i] + arr[j];
//         // Hindi: Dono elements ka sum nikal rahe hain.
//         // English: Calculate the sum of the two elements.

//         if (ans == target) {
//           // Hindi: Check karo sum target ke equal hai ya nahi.
//           // English: Check whether the sum is equal to the target.

//           System.out.println("Indices are: " + i + " , " + j);
//           // Hindi: Pair mil gaya, indices print karo.
//           // English: Pair found, print their indices.

//           return;
//           // Hindi: Function ko yahin stop kar do.
//           // English: Exit the function because the answer is found.
//         }
//       }
//     }

//     System.out.println("No pair found");
//     // Hindi: Agar pair nahi mila to message print karo.
//     // English: Print this message if no valid pair exists.
//   }

//   public static void main(String[] args) {
//     // Hindi: Program yahin se start hota hai.
//     // English: Program execution starts from the main method.

//     int[] arr = { 4, 2, 5, 8, 6, 1, 3, 7 };
//     // Hindi: Input array.
//     // English: Input array.

//     Sum(arr);
//     // Hindi: Sum() function call kiya.
//     // English: Call the Sum() method.
//   }
// }