import java.util.Arrays;

public class SquareArray {

  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int[] square(int[] arr) {

    int n = arr.length;
  // int ans[] = new int[n];
 
    for (int i = 0; i < n; i++) {
      arr[i]=arr[i]*arr[i];
    }
     Arrays.sort(arr);
     System.out.println();
    return arr;
  }

  public static  void main(String []args){
    int arr[]= {-1,2,-3, 1};
    System.out.println("before square");
    printArr(arr);
     square(arr);
      System.out.println("After square");
    printArr(arr);
  }
}
