import java.util.Scanner;
public class Exception_problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s.nextInt();
        System.out.println("Enter second number:");
        int b = s.nextInt();

        try {
           int c=a/b;
           System.out.println(c); 
        } catch (Exception e) {
            System.out.println("we cannot divided by zero");

        }
        System.out.println("hello");
        System.out.println("hii");
        System.out.println("byee");
    }
    
}
