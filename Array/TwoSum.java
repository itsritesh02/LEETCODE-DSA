class Solution {
  static void TwoSum(int[] arr) {
    int target = 19;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int ans = arr[i] + arr[j];
        if (ans == target) {
          System.out.println("Indices are: " + i + " , " + j);
          return;
        }

      }
    }
    System.out.println("No pair found");

  }

  public static void main(String[] args) {
    int[] arr = { 4, 2, 5, 8, 6, 1, 3, 7 };
    TwoSum(arr);
  }
}