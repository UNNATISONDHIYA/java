import java.util.Scanner;
public class IncreasedByFive {
    public static void main(String[] args) {
        int result = addfive();
        System.out.println("Answer:" +result);
    }
    public static int addfive()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number:");
        int a = in.nextInt();
        return (a+5);
    }
    
}

