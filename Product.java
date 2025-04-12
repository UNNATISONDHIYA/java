import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        int p = multiplication();
        System.out.println("Product:" +p);
    }
    public static int multiplication()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter first number:");
        int a = in.nextInt();
        System.out.println("enter second number:");
        int b = in.nextInt();
        return a*b;
    }
    
}
