

/* 724 */

public class PivotIdx {

  static int findPivot(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      int l = 0;
      int r = 0;

      for (int j = 0; j < i; j++) {
        l += arr[j];
      }

      for (int j = i + 1; j < n; j++) {
        r += arr[j];
      }

      if (l == r) {
        return i;
      }
    }

    return -1;

  }

  public static void main(String[] args) {
    int arr[] = { 1, 7, 3, 6, 5, 6 };
    System.out.println(findPivot(arr));
  }
}

// -------------------------------------------------------------------------------------------------------
/*
 * Approach: Brute Force
 * 
 * - Consider every index as a pivot.
 * - Calculate the sum of elements on the left side.
 * - Calculate the sum of elements on the right side.
 * - If both sums are equal, return that index.
 */

/*
 * Algorithm:
 * 1. Traverse the array.
 * 2. For each index, calculate the left sum.
 * 3. Calculate the right sum.
 * 4. Compare both sums.
 * 5. If they are equal, return the current index.
 * 6. If no pivot index is found, return -1.
 */

/*
 * Time Complexity: O(n²)
 * - For every index, left and right sums are calculated.
 * 
 * Space Complexity: O(1)
 * - No extra space is used.
 */

/*
 * public class pivotIndex {
 * 
 * static int findPivot(int[] arr) {
 * 
 * // Get the size of the array
 * // Array ka size n me store karo
 * int n = arr.length;
 * 
 * // Traverse every index of the array
 * // Har index ko ek baar pivot maan kar check karo
 * for (int i = 0; i < n; i++) {
 * 
 * // Store left side sum
 * // Left side ka sum store karega
 * int l = 0;
 * 
 * // Store right side sum
 * // Right side ka sum store karega
 * int r = 0;
 * 
 * // Calculate the left sum
 * // Pivot ke left side ke elements ka sum nikalo
 * for (int j = 0; j < i; j++) {
 * l += arr[j];
 * }
 * 
 * // Calculate the right sum
 * // Pivot ke right side ke elements ka sum nikalo
 * for (int j = i + 1; j < n; j++) {
 * r += arr[j];
 * }
 * 
 * // Check if left sum and right sum are equal
 * // Agar left aur right sum equal hain to pivot index mil gaya
 * if (l == r) {
 * return i;
 * }
 * }
 * 
 * // No pivot index found
 * // Agar koi pivot index nahi mila to -1 return karo
 * return -1;
 * }
 * 
 * public static void main(String[] args) {
 * 
 * // Input array
 * // Input array
 * int arr[] = {1, 7, 3, 6, 5, 6};
 * 
 * // Print the pivot index
 * // Pivot index print karo
 * System.out.println(findPivot(arr));
 * }
 * }
 */