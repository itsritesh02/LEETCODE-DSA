
import java.util.Scanner;

public class RemoveDuplicate {

  static int removeElements(int arr[]) {
    int k = 0;
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[k] = arr[i];
        k++;

      }

    }
    arr[k] = arr[arr.length - 1];
    k++;
    return k;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of Array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter Arrray Elements");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = removeElements(arr);
    System.out.println("Array result :" + ans);

    for (int i = 0; i < ans; i++) {

      System.out.println(arr[i]);
    }
  }
}
