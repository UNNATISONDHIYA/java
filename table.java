//question no 7
import java.util.Scanner;
public class table {
    public static void main(String[] args)
    {
        System.out.println("enter number whose table you want to print :");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("table of given number:");
        for(int i=1;i<=10;i++)
        {
            System.out.println (i*n);
        } 
    } 
        
        

        
    }
    
