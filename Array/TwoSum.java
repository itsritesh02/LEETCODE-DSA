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

// public class TwoSum {
//   // TwoSum naam ki class banayi.

//   static void Sum(int[] arr) {
//     // Sum() function array lega.
//     // Target ke equal sum wale do elements ke indices print karega.

//     int target = 11;
//     // Target value 11 hai.
//     // Hume do aise numbers dhoondhne hain jinka sum 11 ho.

//     for (int i = 0; i < arr.length; i++) {
//       // Outer loop.
//       // Har element ko ek-ek karke first number maan rahe hain.

//       for (int j = i + 1; j < arr.length; j++) {
//         // Inner loop.
//         // i ke baad wale sab elements ko second number maan rahe hain.

//         int ans = arr[i] + arr[j];
//         // Dono elements ka sum nikal rahe hain.

//         if (ans == target) {
//           // Check karo kya sum target ke equal hai.

//           System.out.println("Indices are: " + i + " , " + j);
//           // Agar sum target ke equal hai,
//           // to dono indices print kar do.

//           return;
//           // Pair mil gaya.
//           // Function yahin khatam kar do.
//         }

//       }
//     }

//     System.out.println("No pair found");
//     // Agar poora array check karne ke baad bhi pair na mile,
//     // to ye message print hoga.
//   }

//   public static void main(String[] args) {
//     // Program execution yahin se start hota hai.

//     int[] arr = { 4, 2, 5, 8, 6, 1, 3, 7 };
//     // Input array banaya.

//     Sum(arr);
//     // Sum() function call kiya.
//   }
// }