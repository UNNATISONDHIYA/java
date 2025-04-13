
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        int result = div();
        System.out.println("division:" +result);
    }
    public static int div()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter first integer:");
        int a = in.nextInt();
        System.out.println("enter second integer:");
        int b = in.nextInt();
        return (a/b);
    }
    
}
