public class MajorityElements {

static int Major(int []arr){
  for(int i=0;i<arr.length; i++){
    int count=1;
    for(int j=i+1;j<arr.length;j++){
      if(arr[i]==arr[j]){
        count ++;
      }

      if(count>arr.length/2){
        return arr[i];
        
      }
    }
  }
  return -1;
}

  public static void main(String[] args) {
    int[] arr = { 3, 2, 3,  };
    int ans = Major(arr);

    System.out.println(ans);
 
  }
}



// ----------------------------------------------------------------------------------------------------

/*
public class MajorityElements {
// Hindi: MajorityElements naam ki class banayi.
// English: Created a class named MajorityElements.

    static int Major(int[] arr) {
    // Hindi: Major() function array lega aur majority element return karega.
    // English: The Major() method takes an array and returns the majority element.

        for (int i = 0; i < arr.length; i++) {
        // Hindi: Outer loop array ke har element ko ek-ek karke check karega.
        // English: The outer loop checks each element one by one.

            int count = 1;
            // Hindi: Count ko 1 se start kiya.
            // Kyunki current element ko ek baar to count karenge hi.
            // English: Initialize count to 1 because the current element
            // is already counted once.

            for (int j = i + 1; j < arr.length; j++) {
            // Hindi: Inner loop current element ke baad wale sab elements ko check karega.
            // English: The inner loop checks all elements after the current element.

                if (arr[i] == arr[j]) {
                // Hindi: Check karo dono elements same hain ya nahi.
                // English: Check whether both elements are equal.

                    count++;
                    // Hindi: Agar same mile to count ko 1 se badha do.
                    // English: If they are equal, increase the count by 1.
                }

                if (count > arr.length / 2) {
                // Hindi: Check karo kya count array ke half se zyada hai.
                // English: Check whether the count is greater than half of the array size.

                    return arr[i];
                    // Hindi: Majority element mil gaya, use return kar do.
                    // English: Majority element found, return it.
                }

            }
        }

        return -1;
        // Hindi: Agar majority element nahi mila to -1 return karo.
        // English: Return -1 if no majority element exists.
    }

    public static void main(String[] args) {
    // Hindi: Program execution yahin se start hota hai.
    // English: Program execution starts from the main() method.

        int[] arr = {3, 2, 3};
        // Hindi: Input array.
        // English: Input array.

        int ans = Major(arr);
        // Hindi: Major() function call kiya aur answer ans me store kiya.
        // English: Called the Major() method and stored the result in ans.

        System.out.println(ans);
        // Hindi: Final answer print kiya.
        // English: Printed the final answer.
    }
}
*/