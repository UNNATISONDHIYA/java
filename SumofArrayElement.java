import java.util.Scanner;
public class SumofArrayElement {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = s.nextInt();
    int[] arr = new int[n];
    int sum = 0;
    System.out.println("Enter elements:");
    for(int i=0;i<n;i++)
    {
        arr[i] = s.nextInt();
        sum+=arr[i];
    }
    System.out.println("Sum=" +sum);
       
   } 
}
