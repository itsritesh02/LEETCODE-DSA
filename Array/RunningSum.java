public class RunningSum {

  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");

    }
  }

  static int[] Sum(int[] arr) {
    int n = arr.length;
    int ans[] = new int[n];
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j <= i; j++) {
        sum += arr[j];

        ans[i] = sum;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    printArr(arr);
    int res[] = Sum(arr);
    System.out.println(" ");
    printArr(res);
  }
}



/*
Approach: Brute Force

- Traverse the array.
- For every index, calculate the sum from index 0 to the current index.
- Store the sum in a new array.
- Return the running sum array.
*/

/*
Algorithm:
1. Create a new array of the same size.
2. Traverse the array.
3. For each index, calculate the sum from 0 to i.
4. Store the sum in the answer array.
5. Return the answer array.
*/

/*
Time Complexity: O(n²)
- For every index, the inner loop calculates the running sum.

Space Complexity: O(n)
- A new array is used to store the running sums.
*/



/*
public class RunningSum {

    // Print all elements of the array
    // Array ke saare elements print karo
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Calculate the running sum of the array
    // Array ka running sum calculate karo
    static int[] Sum(int[] arr) {

        // Store the size of the array
        // Array ka size store karo
        int n = arr.length;

        // Create a new array to store the running sums
        // Running sum store karne ke liye naya array banao
        int[] ans = new int[n];

        // Traverse each index
        // Har index ko traverse karo
        for (int i = 0; i < n; i++) {

            // Store the sum till the current index
            // Current index tak ka sum store karega
            int sum = 0;

            // Calculate the sum from index 0 to i
            // Index 0 se i tak ka sum nikalo
            for (int j = 0; j <= i; j++) {
                sum += arr[j];

                // Store the running sum
                // Running sum ko answer array me store karo
                ans[i] = sum;
            }
        }

        // Return the running sum array
        // Running sum array return karo
        return ans;
    }

    public static void main(String[] args) {

        // Input array
        // Input array
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        // Original array print karo
        printArr(arr);

        // Calculate the running sum
        // Running sum calculate karo
        int[] res = Sum(arr);

        System.out.println();

        // Print the running sum array
        // Running sum array print karo
        printArr(res);
    }
} */