import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        int result = getcube();
        System.out.println("cube of given number:" +result);
    }
    public static int getcube()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number:");
        int n = in.nextInt();
        return n*n*n;
    }
    
}

