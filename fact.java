import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial of a given number:" + (f));


    }
    
}
