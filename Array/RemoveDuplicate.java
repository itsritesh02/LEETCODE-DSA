
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


//--------------------------------------------------------------------------------------------------------------------------------------

// import java.util.Scanner;
// // Hindi: Scanner class import ki hai taki user se input le saken.
// // English: Imported the Scanner class to take input from the user.

// public class RemoveDuplicate {
//   // Hindi: RemoveDuplicate naam ki class banayi.
//   // English: Created a class named RemoveDuplicate.

//   static int removeElements(int arr[]) {
//     // Hindi: Ye function sorted array se duplicate elements remove karega.
//     // English: This method removes duplicate elements from a sorted array.

//     int k = 0;
//     // Hindi: k batata hai ki next unique element kis index par store hoga.
//     // English: k represents the index where the next unique element will be stored.

//     for (int i = 0; i < arr.length - 1; i++) {
//       // Hindi: Loop last element se ek pehle tak chalega.
//       // English: The loop runs from the first element to the second last element.

//       if (arr[i] != arr[i + 1]) {
//         // Hindi: Check karo current element aur next element alag hain ya nahi.
//         // English: Check whether the current element is different from the next
//         // element.

//         arr[k] = arr[i];
//         // Hindi: Agar current element unique hai,
//         // to use array ke front me store kar do.
//         // English: If the current element is unique,
//         // copy it to the front of the array.

//         k++;
//         // Hindi: Agle unique element ke liye index badha do.
//         // English: Move to the next position for storing a unique element.
//       }

//     }

//     arr[k] = arr[arr.length - 1];
//     // Hindi: Last element ko bhi store karo.
//     // Kyuki loop last element tak nahi gaya tha.
//     // English: Copy the last element because the loop does not process it.

//     k++;
//     // Hindi: Last unique element add hone ke baad count badha do.
//     // English: Increase the count after storing the last element.

//     return k;
//     // Hindi: Total unique elements ki count return karo.
//     // English: Return the total number of unique elements.
//   }

//   public static void main(String[] args) {
//     // Hindi: Program execution yahin se start hota hai.
//     // English: Program execution starts from the main() method.

//     Scanner sc = new Scanner(System.in);
//     // Hindi: Scanner object banaya.
//     // English: Created a Scanner object.

//     System.out.print("Enter Size of Array: ");
//     // Hindi: User se array ka size maanga.
//     // English: Ask the user to enter the size of the array.

//     int n = sc.nextInt();
//     // Hindi: Size input liya.
//     // English: Read the array size.

//     int arr[] = new int[n];
//     // Hindi: Array banaya.
//     // English: Created an array of size n.

//     System.out.println("Enter Array Elements");
//     // Hindi: User se array ke elements maange.
//     // English: Ask the user to enter the array elements.

//     for (int i = 0; i < arr.length; i++) {
//       // Hindi: Loop se array ke elements input kar rahe hain.
//       // English: Read all elements of the array using a loop.

//       arr[i] = sc.nextInt();
//       // Hindi: Har element input kiya.
//       // English: Read each array element.
//     }

//     int ans = removeElements(arr);
//     // Hindi: removeElements() function call kiya.
//     // English: Called the removeElements() method.

//     System.out.println("Array Result: " + ans);
//     // Hindi: Unique elements ki total count print ki.
//     // English: Print the total number of unique elements.

//     for (int i = 0; i < ans; i++) {
//       // Hindi: Sirf unique elements print karenge.
//       // English: Print only the unique elements.

//       System.out.println(arr[i]);
//       // Hindi: Updated array ke unique elements print kiye.
//       // English: Print each unique element.
//     }

//     sc.close();
//     // Hindi: Scanner ko close kar diya.
//     // English: Closed the Scanner object.
//   }
// }