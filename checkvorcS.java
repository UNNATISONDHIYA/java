
import java.util.Scanner;
//question no 4
public class checkvorcS {
    public static void main(String[] args) {
        System.out.println("enter an alphabet:");
        Scanner in= new Scanner (System.in);
        char c = in.next().charAt(0);
        switch(c){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            System.out.println("vowel");
            break;
            default:System.out.println("consonant");
        }
    }
}
