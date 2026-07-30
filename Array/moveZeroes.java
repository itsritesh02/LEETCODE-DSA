/*283 */


public class MoveZeroes {




static void printArr(int arr[]){
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
}

  static int move(int [] arr){

    int k=0;

    for (int i = 0; i < arr.length; i++) {
     if(arr[i]!=0){
      int temp = arr[k];
      arr[k]=arr[i];
      arr[i]=temp;
      k++;
     }   
    }

    return k;
  }
  public static void main(String[] args) {
    int arr[] ={1, 0, 2, 0,  5, 0 , 3, 0, 2, 1} ;
printArr(arr);
System.out.println();
  move(arr);
 printArr(arr);
  }
}




//----------------------------------------------------------------------------------


/*
Approach: Two Pointer Technique (In-Place Swapping)

Algorithm:
- Use two pointers: i and k.
- i traverses the array.
- k stores the next position for a non-zero element.
- If arr[i] != 0, swap arr[i] with arr[k].
- Increment k.
- After traversal, all non-zero elements are at the beginning
  and all zeroes are moved to the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/



/*

public class MoveZeroes {

    // Print the array
    // Array ko print karne ka function
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to move all zeroes to the end
    // Zeroes ko array ke end me move karne ka function
    static int move(int[] arr) {

        // k stores the index where the next non-zero element should be placed
        // k batata hai ki agla non-zero element kis index par rakhna hai
        int k = 0;

        // Traverse the entire array
        // Puri array ko traverse karo
        for (int i = 0; i < arr.length; i++) {

            // If the current element is not zero
            // Agar current element zero nahi hai
            if (arr[i] != 0) {

                // Swap the current non-zero element with arr[k]
                // Current non-zero element ko arr[k] ke saath swap karo
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;

                // Move k to the next position
                // k ko next position par le jao
                k++;
            }
        }

        // Return the count of non-zero elements
        // Non-zero elements ki count return karo
        return k;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 5, 0, 3, 0, 2, 1};

        System.out.println("Before Moving Zeroes:");
        printArr(arr);

        System.out.println();

        // Move zeroes to the end
        // Zeroes ko end me move karo
        move(arr);

        System.out.println("\nAfter Moving Zeroes:");
        printArr(arr);
    }
}*/