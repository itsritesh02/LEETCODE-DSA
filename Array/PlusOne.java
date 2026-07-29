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


//---------------------------------------------------------------------------------------------------------------------------------------------

// import java.util.Scanner;
// // Hindi: Scanner class import ki hai taki user se input le saken.
// // English: Imported the Scanner class to take input from the user.

// public class PlusOne {
//   // Hindi: PlusOne naam ki class banayi.
//   // English: Created a class named PlusOne.

//   static int[] plusOne(int[] arr) {
//     // Hindi: plusOne() function array lega aur number me 1 add karega.
//     // English: The plusOne() method takes an array and adds 1 to the number
//     // represented by it.

//     int n = arr.length;
//     // Hindi: Array ki length n me store ki.
//     // English: Stored the length of the array in n.

//     for (int i = n - 1; i >= 0; i--) {
//       // Hindi: Loop last index se first index tak chalega.
//       // English: The loop starts from the last index and moves towards the first.

//       if (arr[i] < 9) {
//         // Hindi: Agar current digit 9 se chhoti hai,
//         // to usme 1 add karke return kar do.
//         // English: If the current digit is less than 9,
//         // increment it by 1 and return the array.

//         arr[i]++;
//         // Hindi: Current digit ko 1 se badha diya.
//         // English: Incremented the current digit by 1.

//         return arr;
//         // Hindi: Updated array return kar diya.
//         // English: Returned the updated array.
//       }

//       arr[i] = 0;
//       // Hindi: Agar digit 9 hai to use 0 bana do.
//       // English: If the digit is 9, change it to 0.
//       // Hindi: Carry next left digit me chala jayega.
//       // English: The carry moves to the previous digit.
//     }

//     int[] ans = new int[n + 1];
//     // Hindi: Agar saare digits 9 the,
//     // to ek naya array banana padega.
//     // English: If all digits were 9,
//     // create a new array with one extra digit.

//     ans[0] = 1;
//     // Hindi: Pehle index par 1 rakho.
//     // English: Place 1 at the first index.

//     return ans;
//     // Hindi: Final answer return kar do.
//     // English: Return the final result.
//   }

//   public static void main(String[] args) {
//     // Hindi: Program execution yahin se start hota hai.
//     // English: Program execution starts from the main() method.

//     Scanner sc = new Scanner(System.in);
//     // Hindi: Scanner object banaya.
//     // English: Created a Scanner object.

//     System.out.print("Enter Size of Array: ");
//     // Hindi: User se array ka size maanga.
//     // English: Ask the user to enter the array size.

//     int n = sc.nextInt();
//     // Hindi: Size input liya.
//     // English: Read the array size.

//     int arr[] = new int[n];
//     // Hindi: Array banaya.
//     // English: Created an array.

//     System.out.print("Enter Array Elements: ");
//     // Hindi: User se array ke elements maange.
//     // English: Ask the user to enter the array elements.

//     for (int i = 0; i < arr.length; i++) {
//       // Hindi: Loop se array ke elements input kar rahe hain.
//       // English: Read all array elements using a loop.

//       arr[i] = sc.nextInt();
//       // Hindi: Har element input kiya.
//       // English: Read each element.
//     }

//     int ans[] = plusOne(arr);
//     // Hindi: plusOne() function call kiya.
//     // English: Called the plusOne() method.

//     for (int val : ans) {
//       // Hindi: Enhanced for loop se answer print kar rahe hain.
//       // English: Using an enhanced for loop to print the result.

//       System.out.print(val + " ");
//       // Hindi: Har element print kiya.
//       // English: Printed each element.
//     }

//     sc.close();
//     // Hindi: Scanner ko close kar diya.
//     // English: Closed the Scanner object.
//   }
// }