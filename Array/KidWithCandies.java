
import java.util.ArrayList;

// public class KidWithCandies {

//   static void kidCandies(int []arr,int extra){
//     int max=0;
//     int n=arr.length;
//     for(int i=0;i<n;i++){
//       if(arr[i]>max){
//         max=arr[i];
//       }
//     }
//       for(int i=0;i<n;i++){
//         if(arr[i]+extra>=max){
//           System.out.println("true");
//         }else{
//           System.out.println("False");
//         }
//       }
     
    
//   }
// public static void main(String[] args) {
//     int arr[]={1,5,6,4,2};
//   int extra=3;
//   kidCandies(arr,extra);

// }

// }



// With boolean ------------------------------


public class KidWithCandies {

  static ArrayList<Boolean> kidCandies(int[] arr, int extra) {
    int max = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }



    ArrayList<Boolean> ans = new ArrayList<>();


    for (int i = 0; i < n; i++) {
      if (arr[i] + extra >= max) {
        ans.add(true);
      } 
      
      
      
      else {
        ans.add(false);
      }
    }
    return ans;

  }

  public static void main(String[] args) {
    int arr[] = { 1, 5, 6, 4, 2 };
    int extra = 3;
    ArrayList<Boolean> result=kidCandies(arr, extra);
    System.out.println(result);

  }

}


//------------------------------------------------------------------------------------------------------------

/*
Approach: Brute Force

- First, find the maximum number of candies.
- Traverse the array again.
- Add the extra candies to each kid's candies.
- If the total is greater than or equal to the maximum candies,
  store true; otherwise, store false.
- Return the ArrayList.
*/

/*
Algorithm:
1. Find the maximum element in the array.
2. Create an ArrayList<Boolean>.
3. Traverse the array.
4. Check if arr[i] + extra >= max.
5. If true, add true to the list; otherwise, add false.
6. Return the ArrayList.
*/

/*
Time Complexity: O(n)
- One traversal to find the maximum element.
- One traversal to build the answer.

Space Complexity: O(n)
- ArrayList is used to store the result.
*/



/*
import java.util.ArrayList;

public class KidWithCandies {

    // Return a list indicating whether each kid can have the greatest number of candies
    // Har bachche ke liye check karo ki extra candies milne ke baad
    // kya uske paas sabse zyada candies ho sakti hain
    static ArrayList<Boolean> kidCandies(int[] arr, int extra) {

        // Store the maximum number of candies
        // Maximum candies store karo
        int max = 0;

        // Store the size of the array
        // Array ka size store karo
        int n = arr.length;

        // Find the maximum element
        // Maximum candies find karo
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create an ArrayList to store the answer
        // Result store karne ke liye ArrayList banao
        ArrayList<Boolean> ans = new ArrayList<>();

        // Traverse the array
        // Puri array traverse karo
        for (int i = 0; i < n; i++) {

            // Check if current kid can have the greatest candies
            // Check karo ki extra candies ke baad current kid ke paas
            // maximum candies hongi ya nahi
            if (arr[i] + extra >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        // Return the final answer
        // Final result return karo
        return ans;
    }

    public static void main(String[] args) {

        // Input array
        // Input array
        int[] arr = {1, 5, 6, 4, 2};

        // Extra candies
        // Extra candies
        int extra = 3;

        // Store the result
        // Result store karo
        ArrayList<Boolean> result = kidCandies(arr, extra);

        // Print the result
        // Result print karo
        System.out.println(result);
    }
}
*/