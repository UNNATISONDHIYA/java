import java.util.Scanner;
public class EvenOddCount {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = s.nextInt();
    int[] arr = new int[n];
    int even = 0 , odd = 0;
    System.out.println("Enter elements:");
    for(int i=0;i<n;i++)
    {
        arr[i] = s.nextInt();
        if (arr[i]%2==0)
        even++;
        else
        odd++;
    }
    System.out.println("Even:" + even + ", Odd:" +odd);
}
}

        
