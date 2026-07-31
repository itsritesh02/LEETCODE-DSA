import java.util.Arrays;

public class SquareArray {

  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int[] square(int[] arr) {

    int n = arr.length;
  // int ans[] = new int[n];
 
    for (int i = 0; i < n; i++) {
      arr[i]=arr[i]*arr[i];
    }
     Arrays.sort(arr);
     System.out.println();
    return arr;
  }

  public static  void main(String []args){
    int arr[]= {-1,2,-3, 1};
    System.out.println("before square");
    printArr(arr);
     square(arr);
      System.out.println("After square");
    printArr(arr);
  }
}


//------------------------------------------------------------------------------------------------------------------


/*
Approach: Brute Force

- Traverse the array and square each element.
- Sort the squared array in non-decreasing (ascending) order.
- Return the sorted array.
*/

/*
Algorithm:
1. Traverse the array.
2. Square each element.
3. Sort the array using Arrays.sort().
4. Return the sorted array.
*/

/*
Time Complexity: O(n log n)
- Squaring all elements takes O(n).
- Sorting the array takes O(n log n).

Space Complexity: O(1)
- No extra array is created.
- (Ignoring the internal space used by Arrays.sort()).
*/




/*
import java.util.Arrays;

public class SquareArray {

    // Print all elements of the array
    // Array ke saare elements print karo
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Square each element and sort the array
    // Har element ka square nikalo aur array ko sort karo
    static int[] square(int[] arr) {

        // Store the size of the array
        // Array ka size store karo
        int n = arr.length;

        // Square each element
        // Har element ka square nikalo
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Sort the array in ascending order
        // Array ko non-decreasing (ascending) order me sort karo
        Arrays.sort(arr);

        // Return the sorted squared array
        // Sorted squared array return karo
        return arr;
    }

    public static void main(String[] args) {

        // Input array
        // Input array
        int[] arr = {-1, 2, -3, 1};

        // Print original array
        // Original array print karo
        System.out.println("Before Square");
        printArr(arr);

        // Square and sort the array
        // Array ka square nikal kar sort karo
        square(arr);

        // Print the final array
        // Final array print karo
        System.out.println("\nAfter Square");
        printArr(arr);
    }
} */



