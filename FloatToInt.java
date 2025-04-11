import java.util.Scanner;
public class FloatToInt {
    public static void main(String[] args) {
        System.out.println("enter float value:");
        Scanner in = new Scanner(System.in);
        float f = in.nextFloat();
        int i = (int) f;
        System.out.println("float value :" +(f));
        System.out.println("converted int value :" +(i));
        
    }
    
}
