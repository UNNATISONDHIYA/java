import java.util.Scanner;
public class PrintNaturalNo {
    public static void Nnum(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter value of n:");
        int n = obj.nextInt();
        System.out.println("Natural numbers up to n:");
        Nnum(n);
        
    }
    
}
