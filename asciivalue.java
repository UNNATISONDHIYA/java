import java.util.Scanner;
public class asciivalue{
    public static void main(String[] args) {
        System.out.println("enter a character:");
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0) ;
        int ascii = (int) c ;
        System.out.println("Ascii value of given character :" + (ascii));
        }
}