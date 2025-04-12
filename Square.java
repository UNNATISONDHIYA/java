import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        int s = getsquare();
        System.out.println("Double of given number:" +s);
    }
    public static int getsquare()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number:");
        int n = in.nextInt();
        return n*n;
    }
    
}

