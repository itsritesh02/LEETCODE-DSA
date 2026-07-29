import java.util.Scanner;

public class PlusOne {
   
static int[] plusOne(int [] arr){

  int n =arr.length;

  for(int i=n-1;i>=0;i--){
    if(arr[i]<9){
      arr[i]++;
      return arr;
    }
    arr[i]=0;
  }
  int[]ans=new int [n+1];
  ans[0]=1;
  return ans;
}
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of Array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter Arrray Elements: ");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int ans[] = plusOne(arr);
    for(int val:ans){
      System.out.print(val+" ");
    }
   
  }
}






// import java.util.Scanner;
// // Scanner class import ki hai taki user se input le saken.

// public class PlusOne {
//   // PlusOne naam ki class banayi.

//   static int[] plusOne(int[] arr) {
//     // plusOne() function array lega aur usme 1 add karke
//     // naya result return karega.

//     int n = arr.length;
//     // Array ki length n me store kar li.

//     for (int i = n - 1; i >= 0; i--) {
//       // Loop last index se first index tak chalega.
//       // Kyuki addition hamesha last digit se hota hai.

//       if (arr[i] < 9) {
//         // Agar current digit 9 se chhoti hai,
//         // to usme 1 add karke kaam khatam.

//         arr[i]++;
//         // Current digit ko 1 se badha diya.

//         return arr;
//         // Updated array return kar diya.
//       }

//       arr[i] = 0;
//       // Agar digit 9 hai,
//       // to wo 0 ban jayegi (carry generate hoga).
//     }

//     int[] ans = new int[n + 1];
//     // Agar saare digits 9 the,
//     // to naya array banana padega.
//     // Size ek bada hoga.

//     ans[0] = 1;
//     // Sabse pehle index par 1 rakh diya.
//     // Baaki sab values default 0 hongi.

//     return ans;
//     // Final answer return kar diya.
//   }

//   public static void main(String[] args) {
//     // Program execution yahin se start hota hai.

//     Scanner sc = new Scanner(System.in);
//     // Scanner object banaya.

//     System.out.print("Enter Size of Array: ");
//     // User se array ka size puchha.

//     int n = sc.nextInt();
//     // Size input liya.

//     int arr[] = new int[n];
//     // Array banaya.

//     System.out.print("Enter Array Elements: ");
//     // User se array ke elements maange.

//     for (int i = 0; i < arr.length; i++) {
//       // Array me values input kar rahe hain.

//       arr[i] = sc.nextInt();
//       // Har element read kiya.
//     }

//     int ans[] = plusOne(arr);
//     // plusOne() function call kiya.

//     for (int val : ans) {
//       // Enhanced for loop se answer print kar rahe hain.

//       System.out.print(val + " ");
//     }

//     sc.close();
//     // Scanner band kar diya.
//   }
// }
