import java.util.Scanner;
public class SumOfNaturalNo {
    public static void Sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of n natural numbers:" + sum);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter a number(n):");
        int n = obj.nextInt();
        Sum(n);
    }
    
}
