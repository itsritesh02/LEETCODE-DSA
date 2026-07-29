
import java.util.Arrays;

public class MergeArray {

  static int[] Merge(int []num1, int num2[]){
    int n1=num1.length;
    int n2 =num2.length;
    
    int[] ans = new int [n1+n2];

    //first array
    for(int i=0; i<n1;i++){
      ans[i]=num1[i];
    }

    //2nd Array
    for(int i = 0; i<n2;i++){
      ans[n1+i]=num2[i];
    }
    Arrays.sort(ans);
    return ans;
  
  }

  public static void main(String[] args) {
    int [] num1={1,2,9};
    int [] num2={2,5,6};
    int ans[] =Merge(num1, num2);
  for(int i = 0; i < ans.length; i++){
    System.out.print(ans[i] + " ");
}
  }}
  




//   import java.util.Arrays;
// // Arrays class import ki hai taki Arrays.sort() use kar saken.

// public class MergeArray {

//   static int[] Merge(int[] num1, int[] num2) {

//     int n1 = num1.length;
//     // n1 me first array ki length store ho rahi hai.

//     int n2 = num2.length;
//     // n2 me second array ki length store ho rahi hai.

//     int[] ans = new int[n1 + n2];
//     // Dono arrays ko rakhne ke liye ek naya array banaya.
//     // Size = first array + second array

//     // ---------------- First Array Copy ----------------

//     for (int i = 0; i < n1; i++) {
//       ans[i] = num1[i];
//       // First array ke elements ko ans me copy kar rahe hain.
//     }

//     // Example:
//     // num1 = [1,2,9]
//     // ans = [1,2,9,0,0,0]

//     // ---------------- Second Array Copy ----------------

//     for (int i = 0; i < n2; i++) {
//       ans[n1 + i] = num2[i];
//       // Second array ke elements ko first array ke baad copy kar rahe hain.
//     }

//     // Example:
//     // num2 = [2,5,6]
//     // ans = [1,2,9,2,5,6]

//     Arrays.sort(ans);
//     // Pura ans array ascending order me sort kar diya.

//     // ans = [1,2,2,5,6,9]

//     return ans;
//     // Sorted merged array return kar diya.
//   }

//   public static void main(String[] args) {

//     int[] num1 = { 1, 2, 9 };
//     // First array

//     int[] num2 = { 2, 5, 6 };
//     // Second array

//     int[] ans = Merge(num1, num2);
//     // Merge() function call kiya aur result ans me store kar liya.

//     for (int i = 0; i < ans.length; i++) {
//       // ans array ke har element ko print kar rahe hain.

//       System.out.print(ans[i] + " ");
//     }
//   }
// }