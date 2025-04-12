import java.util.Scanner;
public class Addtwointeger {
    public static void main(String[] args) {
        int result = add();
        System.out.println("sum:" +result);
    }
    public static int add()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter first integer:");
        int a = in.nextInt();
        System.out.println("enter second integer:");
        int b = in.nextInt();
        return (a+b);
    }
    
}
