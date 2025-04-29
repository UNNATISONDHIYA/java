import java.util.Scanner;
public class ProductOfNaturalNo {
    public static void Product(int n)
    {
        int product = 1;
        for(int i=1;i<=n;i++)
        {
            product = product*i;
        }
        System.out.println("Product of n natural numbers:" +product);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number (n) :");
        int n=obj.nextInt();
        Product(n);

    }

    
}
