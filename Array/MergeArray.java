
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
  


  // --------------------------------------------------------------------------------------------------

  /*







/*
Approach: Brute Force

- Create a new array to store elements of both arrays.
- Copy all elements of the first array into the new array.
- Copy all elements of the second array into the remaining positions.
- Sort the merged array.
- Return the sorted merged array.
*/

/*
Algorithm:
1. Create a new array of size n1 + n2.
2. Copy all elements of the first array into the new array.
3. Copy all elements of the second array into the new array.
4. Sort the merged array using Arrays.sort().
5. Return the merged array.
*/

/*
Time Complexity: O((n + m) log(n + m))
- Copying elements takes O(n + m).
- Sorting takes O((n + m) log(n + m)).

Space Complexity: O(n + m)
- A new array is created to store the merged elements.
*/










//   import java.util.Arrays;
// // Hindi: Arrays class import ki hai taki Arrays.sort() use kar saken.
// // English: Imported the Arrays class to use the Arrays.sort() method.

// public class MergeArray {
// // Hindi: MergeArray naam ki class banayi.
// // English: Created a class named MergeArray.

//     static int[] Merge(int[] num1, int[] num2) {
//     // Hindi: Merge() function do arrays lega aur merged sorted array return karega.
//     // English: The Merge() method takes two arrays and returns a merged sorted array.

//         int n1 = num1.length;
//         // Hindi: First array ki length n1 me store ki.
//         // English: Stored the length of the first array in n1.

//         int n2 = num2.length;
//         // Hindi: Second array ki length n2 me store ki.
//         // English: Stored the length of the second array in n2.

//         int[] ans = new int[n1 + n2];
//         // Hindi: Dono arrays ke elements rakhne ke liye naya array banaya.
//         // English: Created a new array to store elements of both arrays.

//         // First Array
//         for (int i = 0; i < n1; i++) {
//         // Hindi: First array ke har element ko copy karenge.
//         // English: Copy all elements of the first array.

//             ans[i] = num1[i];
//             // Hindi: First array ka element ans array me copy kiya.
//             // English: Copied the current element of the first array into ans.
//         }

//         // Second Array
//         for (int i = 0; i < n2; i++) {
//         // Hindi: Second array ke har element ko copy karenge.
//         // English: Copy all elements of the second array.

//             ans[n1 + i] = num2[i];
//             // Hindi: Second array ke elements ko first array ke baad store kiya.
//             // English: Stored the second array elements after the first array elements.
//         }

//         Arrays.sort(ans);
//         // Hindi: Pura merged array ascending order me sort kar diya.
//         // English: Sorted the merged array in ascending order.

//         return ans;
//         // Hindi: Final sorted array return kar diya.
//         // English: Returned the final sorted array.
//     }

//     public static void main(String[] args) {
//     // Hindi: Program execution yahin se start hota hai.
//     // English: Program execution starts from the main() method.

//         int[] num1 = {1, 2, 9};
//         // Hindi: First input array.
//         // English: First input array.

//         int[] num2 = {2, 5, 6};
//         // Hindi: Second input array.
//         // English: Second input array.

//         int[] ans = Merge(num1, num2);
//         // Hindi: Merge() function call kiya aur result ans me store kiya.
//         // English: Called the Merge() method and stored the result in ans.

//         for (int i = 0; i < ans.length; i++) {
//         // Hindi: Merged array ke har element ko print karenge.
//         // English: Print each element of the merged array.

//             System.out.print(ans[i] + " ");
//             // Hindi: Har element print kiya.
//             // English: Printed each element.
//         }
//     }
// }
  