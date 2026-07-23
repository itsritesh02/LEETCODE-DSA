import java.util.Scanner;

public class RemoveElement {

  static int remove(int nums[], int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array");
    int n = sc.nextInt();

    int[] nums = new int[n];

    System.out.println("Enter Array Elements");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }

    System.out.println("Enter value");
    int val = sc.nextInt();
    int ans = remove(nums, val);
    System.out.println("new length:" + ans);

    System.out.println("Nums After removing Value");

    for (int i = 0; i < ans; i++) {

      System.out.print(nums[i] + " ");
    }

  }
}
