import java.util.Scanner;
public class Double {
    public static void main(String[] args) {
        int d = getdouble();
        System.out.println("Double of given number:" +d);
    }
    public static int getdouble()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number:");
        int n = in.nextInt();
        return n*2;
    }
    
}

