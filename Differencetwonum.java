import java.util.Scanner;
public class Differencetwonum {
    public static void main(String[] args) {
        int r = difference();
        System.out.println("Difference:" +r);
    }
    public static int difference()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter first number:");
        int a = in.nextInt();
        System.out.println("enter second number:");
        int b = in.nextInt();
        return a-b;
    }
    
}
