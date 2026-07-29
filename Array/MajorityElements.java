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



// public class MajorityElements {
//   // MajorityElements naam ki class banayi.

//   static int Major(int[] arr) {
//     // Major() function array lega aur majority element return karega.

//     for (int i = 0; i < arr.length; i++) {
//       // Outer loop.
//       // Har element ko ek-ek karke pick karega.

//       int count = 1;
//       // count = 1 se start kiya.
//       // Kyuki jis element par khade hain,
//       // usko ek baar to count karenge hi.

//       for (int j = i + 1; j < arr.length; j++) {
//         // Inner loop.
//         // Current element ke baad wale sab elements ko compare karega.

//         if (arr[i] == arr[j]) {
//           // Check karo dono elements same hain ya nahi.

//           count++;
//           // Agar same mile to count ko 1 se badha do.
//         }

//         if (count > arr.length / 2) {
//           // Check karo kya count array ke half se zyada ho gaya hai.
//           // Agar haan, to ye majority element hai.

//           return arr[i];
//           // Majority element mil gaya.
//           // Use return kar do aur function yahin khatam.
//         }
//       }
//     }

//     return -1;
//     // Agar koi majority element nahi mila,
//     // to -1 return karo.
//   }

//   public static void main(String[] args) {
//     // Program execution yahin se start hota hai.

//     int[] arr = { 3, 2, 3 };
//     // Input array banaya.

//     int ans = Major(arr);
//     // Major() function call kiya.
//     // Jo answer mila use ans variable me store kiya.

//     System.out.println(ans);
//     // Final answer print kar diya.
//   }
// }