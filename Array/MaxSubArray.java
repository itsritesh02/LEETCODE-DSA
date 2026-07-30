/*53 */


public class MaxSubArray {
  static int maxSub(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;

      for (int j = i; j < arr.length; j++) {
        sum += arr[j];
        if (sum > max) {
          max = sum;
        }
      }

    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, -1, 7, 8 };
    System.out.println(maxSub(arr));
  }
}


//-------------------------------------------------------------------------------------------------------










/*
Approach: Brute Force



- Generate all possible subarrays.
- Calculate the sum of each subarray.
- Keep track of the maximum subarray sum.
- Return the maximum sum.
*/

/*
Algorithm:
1. Initialize max = Integer.MIN_VALUE.
2. Traverse the array using the first loop.
3. Initialize sum = 0 for each starting index.
4. Traverse the remaining elements using the second loop.
5. Add the current element to sum.
6. If sum > max, update max.
7. Return max.
*/

/*
Time Complexity: O(n²)
- Two nested loops are used.

Space Complexity: O(1)
- No extra space is used.
*/








/*
public class MaxSubArray {
// Hindi: MaxSubArray naam ki class banayi.
// English: Created a class named MaxSubArray.

    static int maxSub(int[] arr) {
    // Hindi: maxSub() function array ka maximum subarray sum return karega.
    // English: The maxSub() method returns the maximum subarray sum.

        int max = Integer.MIN_VALUE;
        // Hindi: max ko sabse chhoti integer value se initialize kiya.
        // English: Initialize max with the smallest possible integer value.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Outer loop har index se subarray start karega.
        // English: The outer loop starts a subarray from every index.

            int sum = 0;
            // Hindi: Har naye starting index ke liye sum ko 0 se start kiya.
            // English: Initialize sum to 0 for every new starting index.

            for (int j = i; j < arr.length; j++) {
            // Hindi: Inner loop i se last index tak subarray banayega.
            // English: The inner loop extends the subarray from i to the last index.

                sum += arr[j];
                // Hindi: Current element ko sum me add kiya.
                // English: Add the current element to the running sum.

                if (sum > max) {
                // Hindi: Agar current sum max se bada hai,
                // to max ko update karo.
                // English: If the current sum is greater than max,
                // update max.

                    max = sum;
                    // Hindi: Naya maximum subarray sum store kiya.
                    // English: Store the new maximum subarray sum.
                }
            }
        }

        return max;
        // Hindi: Final maximum subarray sum return kiya.
        // English: Return the final maximum subarray sum.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int[] arr = {5, 4, -1, 7, 8};
        // Hindi: Input array.
        // English: Input array.

        System.out.println(maxSub(arr));
        // Hindi: maxSub() function call karke answer print kiya.
        // English: Called the maxSub() method and printed the result.
    }
}

*/