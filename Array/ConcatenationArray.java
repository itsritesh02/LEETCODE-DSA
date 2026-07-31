


public class ConcatenationArray {

  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int[] concatenate(int[] arr) {
    int n = arr.length;
    int m = arr.length;


    int ans[] = new int[n+m];

    for (int i = 0; i < arr.length; i++) {
      ans[i] = arr[i];
    }

    for (int i = 0; i < arr.length; i++) {
      ans[n+i] = arr[i];
    }

    return ans;
  }

  public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5};
    int ans[] =concatenate(arr);
    printArr(ans);
  }
}


//------------------------------------------------------------------------------------------------------------------------------

/*
Approach: Brute Force

- Create a new array of size 2 * n.
- Copy all elements of the original array into the first half.
- Copy the same elements again into the second half.
- Return the concatenated array.
*/

/*
Algorithm:
1. Find the size of the array.
2. Create a new array of size 2 * n.
3. Copy all elements into the first half of the new array.
4. Copy the same elements into the second half.
5. Return the new array.
*/

/*
Time Complexity: O(n)
- The array is traversed twice.

Space Complexity: O(n)
- A new array of size 2 * n is created.
*/











/*public class ConcatenationArray {

    // Print all elements of the array
    // Array ke saare elements print karo
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Concatenate the array with itself
    // Array ko usi ke saath concatenate karo
    static int[] concatenate(int[] arr) {

        // Store the size of the array
        // Array ka size store karo
        int n = arr.length;
        int m = arr.length;

        // Create a new array of size n + m
        // Naya array banao jiska size n + m ho
        int ans[] = new int[n + m];

        // Copy the original array into the first half
        // Original array ko first half me copy karo
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }

        // Copy the original array again into the second half
        // Original array ko dobara second half me copy karo
        for (int i = 0; i < n; i++) {
            ans[n + i] = arr[i];
        }

        // Return the concatenated array
        // Concatenated array return karo
        return ans;
    }

    public static void main(String[] args) {

        // Input array
        // Input array
        int arr[] = {1, 2, 1};

        // Store the concatenated array
        // Concatenated array store karo
        int ans[] = concatenate(arr);

        // Print the final array
        // Final array print karo
        printArr(ans);
    }
} */