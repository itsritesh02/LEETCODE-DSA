import java.util.Scanner;

public class PlusOne {
   
static int[] plusOne(int [] arr){

  int n =arr.length;

  for(int i=n-1;i>=0;i--){
    if(arr[i]<9){
      arr[i]++;
      return arr;
    }
    arr[i]=0;
  }
  int[]ans=new int [n+1];
  ans[0]=1;
  return ans;
}
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of Array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.print("Enter Arrray Elements: ");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int ans[] = plusOne(arr);
    for(int val:ans){
      System.out.print(val+" ");
    }
   
  }
}
