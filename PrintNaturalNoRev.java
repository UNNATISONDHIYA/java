import java.util.Scanner;
public class PrintNaturalNoRev {
    public static void PrintNoInRev(int n)
    {
        for(int i=n;i>=1;i--)
        {
            System.out.println(i);
        }

    } 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = obj.nextInt();
        System.out.println("Natural nunbers in reverse order:");
        PrintNoInRev(n);     
    }
    
}