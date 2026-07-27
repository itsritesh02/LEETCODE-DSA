
import java.util.Arrays;

public class MergeArray {

  static int[] Merge(int []num1, int num2[]){
    int n1=num1.length;
    int n2 =num2.length;
    
    int[] ans = new int [n1+n2];

    //first array
    for(int i=0; i<num1.length;i++){
      ans[i]=num1[i];
    }

    //2nd Array
    for(int i = 0; i<num2.length;i++){
      ans[num1.length+i]=num2[i];
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
  