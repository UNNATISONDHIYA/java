import java.util.Scanner;
public class returninput {
  public static void main(String[] args) {
    int result = getuserinput();
    System.out.println("you entered:" +result);
      
  }
  public static int getuserinput()
  {
    Scanner in = new Scanner (System.in);
    System.out.println("enter a number:");
    int n = in.nextInt(); 
    return n;
  }  
}
