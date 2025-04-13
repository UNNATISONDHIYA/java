import java.util.Scanner;
public class Modulus {
    public static void main(String[] args) {
        int result = getmodulus();
        System.out.println("modulus:" +result);
    }
    public static int getmodulus()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter first number:");
        int a = in.nextInt();
        System.out.println("enter second number:");
        int b = in.nextInt();
        return (a%b);
    }
    
}

