import java.util.Scanner;

public class RemoveElement {

  static int remove(int nums[], int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int n = sc.nextInt();

    int[] nums = new int[n];

    System.out.println("Enter Array Elements");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }

    System.out.println("Enter value");
    int val = sc.nextInt();
    int ans = remove(nums, val);
    System.out.println("new length:" + ans);

    System.out.println("Nums After removing Value");

    for (int i = 0; i < ans; i++) {

      System.out.print(nums[i] + " ");
    }

  }
}




// import java.util.Scanner;
// // Scanner class import ki hai taki user se input le saken.

// public class RemoveElement {
//   // RemoveElement naam ki class banayi.

//   static int remove(int nums[], int val) {
//     // remove() function array aur ek value (val) lega.
//     // Array se val ko remove karega aur
//     // new length return karega.

//     int k = 0;
//     // k batata hai ki next valid element
//     // kis index par store hoga.

//     for (int i = 0; i < nums.length; i++) {
//       // Loop array ke har element par chalega.

//       if (nums[i] != val) {
//         // Check karo ki current element
//         // remove karne wali value ke equal hai ya nahi.

//         nums[k] = nums[i];
//         // Agar current element val nahi hai,
//         // to usko array ke front me store kar do.

//         k++;
//         // Agle valid element ke liye
//         // index ko 1 se badha do.
//       }
//     }

//     return k;
//     // Total valid elements ki count return kar do.
//   }

//   public static void main(String[] args) {
//     // Program execution yahin se start hota hai.

//     Scanner sc = new Scanner(System.in);
//     // Scanner object banaya.

//     System.out.println("Enter Size of Array");
//     // User se array ka size puchha.

//     int n = sc.nextInt();
//     // Size input liya.

//     int[] nums = new int[n];
//     // Array banaya.

//     System.out.println("Enter Array Elements");
//     // User se array ke elements maange.

//     for (int i = 0; i < nums.length; i++) {
//       // Array me values input kar rahe hain.

//       nums[i] = sc.nextInt();
//       // Har element read kiya.
//     }

//     System.out.println("Enter value");
//     // User se wo value maangi
//     // jise remove karna hai.

//     int val = sc.nextInt();
//     // Remove hone wali value input li.

//     int ans = remove(nums, val);
//     // remove() function call kiya.
//     // ans me new length store ho gayi.

//     System.out.println("New Length: " + ans);
//     // New length print ki.

//     System.out.println("Nums After Removing Value");
//     // Updated array print karenge.

//     for (int i = 0; i < ans; i++) {
//       // Sirf valid elements print karenge.

//       System.out.print(nums[i] + " ");
//       // Updated array ke elements print kiye.
//     }

//     sc.close();
//     // Scanner band kar diya.
//   }
// }



