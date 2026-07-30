
/*27 */

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



//-------------------------------Explanation -------------------------------------------------








/*
Approach: Two Pointer

- Use one pointer (i) to traverse the array.
- Use another pointer (k) to store elements that are not equal to val.
- Copy only the required elements to the front of the array.
- Return the new length of the array.
*/

/*
Algorithm:
1. Initialize k = 0.
2. Traverse the array from index 0 to n-1.
3. If nums[i] != val, copy nums[i] to nums[k].
4. Increment k.
5. Continue until the end of the array.
6. Return k as the new length.
*/

/*
Time Complexity: O(n)
- The array is traversed only once.

Space Complexity: O(1)
- No extra space is used.
*/














// import java.util.Scanner;
// // Hindi: Scanner class import ki hai taki user se input le saken.
// // English: Imported the Scanner class to take input from the user.

// public class RemoveElement {
//   // Hindi: RemoveElement naam ki class banayi.
//   // English: Created a class named RemoveElement.

//   static int remove(int nums[], int val) {
//     // Hindi: remove() function array aur ek value (val) lega.
//     // English: The remove() method takes an array and a value to remove.

//     int k = 0;
//     // Hindi: k batata hai ki next valid element kis index par store hoga.
//     // English: k represents the index where the next valid element will be stored.

//     for (int i = 0; i < nums.length; i++) {
//       // Hindi: Loop array ke har element ko check karega.
//       // English: The loop iterates through every element of the array.

//       if (nums[i] != val) {
//         // Hindi: Check karo ki current element remove hone wali value ke equal hai ya
//         // nahi.
//         // English: Check whether the current element is different from the value to
//         // remove.

//         nums[k] = nums[i];
//         // Hindi: Agar element remove nahi karna hai,
//         // to use array ke front me store kar do.
//         // English: If the element should not be removed,
//         // copy it to the front of the array.

//         k++;
//         // Hindi: Agle valid element ke liye index badha do.
//         // English: Move to the next position for storing a valid element.
//       }
//     }

//     return k;
//     // Hindi: Unique/valid elements ki new length return karo.
//     // English: Return the new length of the updated array.
//   }

//   public static void main(String[] args) {
//     // Hindi: Program execution yahin se start hota hai.
//     // English: Program execution starts from the main() method.

//     Scanner sc = new Scanner(System.in);
//     // Hindi: Scanner object banaya.
//     // English: Created a Scanner object.

//     System.out.println("Enter Size of Array");
//     // Hindi: User se array ka size maanga.
//     // English: Ask the user to enter the size of the array.

//     int n = sc.nextInt();
//     // Hindi: Size input liya.
//     // English: Read the array size.

//     int[] nums = new int[n];
//     // Hindi: Array banaya.
//     // English: Created an array of size n.

//     System.out.println("Enter Array Elements");
//     // Hindi: User se array ke elements maange.
//     // English: Ask the user to enter the array elements.

//     for (int i = 0; i < nums.length; i++) {
//       // Hindi: Loop se array me values input kar rahe hain.
//       // English: Use a loop to read all array elements.

//       nums[i] = sc.nextInt();
//       // Hindi: Har element input kiya.
//       // English: Read each element from the user.
//     }

//     System.out.println("Enter value");
//     // Hindi: User se wo value maangi jise remove karna hai.
//     // English: Ask the user for the value to remove.

//     int val = sc.nextInt();
//     // Hindi: Remove hone wali value input li.
//     // English: Read the value to remove.

//     int ans = remove(nums, val);
//     // Hindi: remove() function call kiya aur new length store ki.
//     // English: Call the remove() method and store the new length.

//     System.out.println("New Length: " + ans);
//     // Hindi: New length print ki.
//     // English: Print the new length of the array.

//     System.out.println("Nums After Removing Value");
//     // Hindi: Updated array print karenge.
//     // English: Print the array after removing the value.

//     for (int i = 0; i < ans; i++) {
//       // Hindi: Sirf valid elements print karenge.
//       // English: Print only the valid elements.

//       System.out.print(nums[i] + " ");
//       // Hindi: Updated array ke elements print kiye.
//       // English: Print each remaining element.
//     }

//     sc.close();
//     // Hindi: Scanner ko close kar diya.
//     // English: Closed the Scanner object.
//   }
// }