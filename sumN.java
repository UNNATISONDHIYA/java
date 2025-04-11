//question no 6
import java.util.Scanner;
public class sumN {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=0,sum=0;
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println("sum:" + (sum));
        }
    
}
