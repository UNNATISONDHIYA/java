
import java.util.Scanner;
public class ReturnDividedBy2 {
    public static void main(String[] args) {
        int r = getdividedbytwo();
        System.out.println("Result : " +r);
    }
    public static int getdividedbytwo()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number:");
        int a = in.nextInt();
        return (a/2);
    }
    
}
