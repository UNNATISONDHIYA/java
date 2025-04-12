import java.util.Scanner;
public class Numberinput {
    public static void main(String[] args) {
        float result = getuserinput();
        System.out.println("you entered:" +result);
    }
    public static float getuserinput()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number:");
        float n = in.nextFloat();
        return n;
    }
    
}
