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


// class Solution {

//   public int maxSubArray(int[] nums) {

//     // Step 1: current aur max ko first element se initialize karo
//     int current = nums[0];
//     int max = nums[0];

//     // Example:
//     // nums = [-2,1,-3,4,-1,2,1,-5,4]
//     //
//     // current = -2
//     // max = -2

//     // Step 2: Second element se loop start
//     for (int i = 1; i < nums.length; i++) {

//       // Har element par do choices hain
//       //
//       // Choice 1:
//       // Sirf current element se naya subarray start karo.
//       //
//       // nums[i]
//       //
//       // Choice 2:
//       // Purane subarray me current element add karo.
//       //
//       // current + nums[i]
//       //
//       // Jo bada hoga wahi current banega.

//       current = Math.max(nums[i], current + nums[i]);

//       // Ab tak mila hua maximum sum update karo

//       max = Math.max(max, current);
//     }

//     // Final answer
//     return max;
//   }
// }