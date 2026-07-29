
import java.util.Scanner;

public class RemoveDuplicate {

  static int removeElements(int arr[]) {
    int k = 0;
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[k] = arr[i];
        k++;

      }

    }
    arr[k] = arr[arr.length - 1];
    k++;
    return k;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of Array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Arrray Elements");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = removeElements(arr);
    System.out.println("Array result :" + ans);

    for (int i = 0; i < ans; i++) {

      System.out.println(arr[i]);
    }
  }
}




// import java.util.Scanner;
// // Scanner class import ki hai taki user se input le saken.

// public class RemoveDuplicate {
//   // RemoveDuplicate naam ki class banayi.

//   static int removeElements(int arr[]) {
//     // removeElements() function sorted array se duplicate remove karega.
//     // Ye unique elements ki count return karega.

//     int k = 0;
//     // k unique elements ka index batata hai.
//     // Jahan next unique element store hoga.

//     for (int i = 0; i < arr.length - 1; i++) {
//       // Loop last se ek pehle tak chalega.
//       // Kyuki hum arr[i] ko arr[i+1] se compare kar rahe hain.

//       if (arr[i] != arr[i + 1]) {
//         // Agar current element aur next element alag hain,
//         // to current element unique hai.

//         arr[k] = arr[i];
//         // Unique element ko array ke starting part me store kar diya.

//         k++;
//         // Agle unique element ke liye index badha diya.
//       }
//     }

//     arr[k] = arr[arr.length - 1];
//     // Last element ko bhi store kar diya.
//     // Kyuki loop last element tak nahi gaya tha.

//     k++;
//     // Last unique element ke baad count badha diya.

//     return k;
//     // Total unique elements ki count return kar di.
//   }

//   public static void main(String[] args) {
//     // Program execution yahin se start hota hai.

//     Scanner sc = new Scanner(System.in);
//     // Scanner object banaya.

//     System.out.print("Enter Size of Array: ");
//     // User se array ka size liya.

//     int n = sc.nextInt();
//     // Size input liya.

//     int arr[] = new int[n];
//     // Array banaya.

//     System.out.println("Enter Array Elements");
//     // User se array ke elements maange.

//     for (int i = 0; i < arr.length; i++) {
//       // Array me values input kar rahe hain.

//       arr[i] = sc.nextInt();
//       // Har element read kiya.
//     }

//     int ans = removeElements(arr);
//     // Function call kiya.
//     // ans me unique elements ki total count store ho gayi.

//     System.out.println("Array result : " + ans);
//     // Unique elements ki count print ki.

//     for (int i = 0; i < ans; i++) {
//       // Sirf unique elements print karenge.

//       System.out.println(arr[i]);
//       // Updated array ke unique elements print kiye.
//     }

//     sc.close();
//     // Scanner band kar diya.
//   }
// }